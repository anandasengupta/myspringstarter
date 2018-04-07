package aps.springboot.myspringstarter.repositories;

import aps.springboot.myspringstarter.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
