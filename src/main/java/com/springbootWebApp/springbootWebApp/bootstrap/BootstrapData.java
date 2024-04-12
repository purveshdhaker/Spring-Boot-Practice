package com.springbootWebApp.springbootWebApp.bootstrap;

import com.springbootWebApp.springbootWebApp.domain.Author;
import com.springbootWebApp.springbootWebApp.domain.Book;
import com.springbootWebApp.springbootWebApp.domain.Publisher;
import com.springbootWebApp.springbootWebApp.repositories.AuthorRepo;
import com.springbootWebApp.springbootWebApp.repositories.BookRepo;
import com.springbootWebApp.springbootWebApp.repositories.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final BookRepo bookRepo;
    private final AuthorRepo authorRepo;
    private final PublisherRepo publisherRepo;

    public BootstrapData(BookRepo bookRepo, AuthorRepo authorRepo, PublisherRepo publisherRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo=authorRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("David");


        Book ddd = new Book();
        ddd.setTitle("Domain Driver Design");
        ddd.setIsbn("978-3-16-148410-0");

        Author ericSaved= authorRepo.save(eric);
        Book dddSaved= bookRepo.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("John");


        Book noEJB = new Book();
        noEJB.setTitle("J2EE Developement with Spring Boot");
        noEJB.setIsbn("5475689323");

        Author rodSaved= authorRepo.save(rod);
        Book noEJBSaved= bookRepo.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        Publisher publisher=new Publisher();
        publisher.setPublisherName("Spring Boot");
        publisher.setPublisherAddress("!123 Main Street");

        Publisher savedPublisher=publisherRepo.save(publisher);

        dddSaved.setPublisher(savedPublisher);
        noEJBSaved.setPublisher(savedPublisher);

        authorRepo.save(ericSaved);
        authorRepo.save(rodSaved);
        bookRepo.save(ddd);
        bookRepo.save(noEJBSaved);

        System.out.println("In Bootstrap Data");
        System.out.println("Author Count: "+authorRepo.count());
        System.out.println("Book Count: "+bookRepo.count());
        System.out.println("Publisher Count: "+publisherRepo.count());

    }
}
