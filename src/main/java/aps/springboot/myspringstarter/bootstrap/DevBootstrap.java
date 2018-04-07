package aps.springboot.myspringstarter.bootstrap;

import aps.springboot.myspringstarter.models.Author;
import aps.springboot.myspringstarter.models.Book;
import aps.springboot.myspringstarter.models.Publisher;
import aps.springboot.myspringstarter.repositories.AuthorRepository;
import aps.springboot.myspringstarter.repositories.BookRepository;
import aps.springboot.myspringstarter.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author a1 = new Author("FN1", "LN1");
        Publisher p1 = new Publisher("Pub1", "Address 1");
        Book b1 = new Book("Title 1", "IBSN1", p1);

        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        authorRepository.save(a1);
        publisherRepository.save(p1);
        bookRepository.save(b1);
    }
}
