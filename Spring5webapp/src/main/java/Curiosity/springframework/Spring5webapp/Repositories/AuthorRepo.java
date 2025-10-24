package Curiosity.springframework.Spring5webapp.Repositories;

import Curiosity.springframework.Spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
