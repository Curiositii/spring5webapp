package Curiosity.springframework.Spring5webapp.Repositories;

import Curiosity.springframework.Spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher,Long> {
}
