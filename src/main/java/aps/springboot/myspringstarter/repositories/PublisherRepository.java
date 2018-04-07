package aps.springboot.myspringstarter.repositories;

import aps.springboot.myspringstarter.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
