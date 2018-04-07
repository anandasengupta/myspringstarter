package aps.springboot.myspringstarter.repositories;

import aps.springboot.myspringstarter.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
