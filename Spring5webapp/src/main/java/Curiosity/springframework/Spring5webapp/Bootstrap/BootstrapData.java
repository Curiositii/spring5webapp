package Curiosity.springframework.Spring5webapp.Bootstrap;

import Curiosity.springframework.Spring5webapp.Repositories.AuthorRepo;
import Curiosity.springframework.Spring5webapp.Repositories.BookRepo;
import Curiosity.springframework.Spring5webapp.Repositories.PublisherRepo;
import Curiosity.springframework.Spring5webapp.domain.Author;
import Curiosity.springframework.Spring5webapp.domain.Book;
import Curiosity.springframework.Spring5webapp.domain.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final PublisherRepo publisherRepo;
    private final BookRepo bookRepo;
    private final AuthorRepo authorRepo;

    public BootstrapData(PublisherRepo publisherRepo, BookRepo bookRepo, AuthorRepo authorRepo) {
        this.publisherRepo = publisherRepo;
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started Correctly");

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");

        Publisher publisher = new Publisher();
        publisher.setPubName("Scholastic");
        publisher.setCity("New York");
        publisher.setState("NY");

        publisherRepo.save(publisher);

        System.out.println("Publisher count: " + publisherRepo.count());

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepo.save(eric);
        bookRepo.save(ddd);
        publisherRepo.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("No-EJB", "12341234");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepo.save(rod);
        bookRepo.save(noEJB);
        publisherRepo.save(publisher);

        System.out.println("Book count: " + bookRepo.count());
        System.out.println("Publisher book count: " + publisher.getBooks().size());
    }
}
