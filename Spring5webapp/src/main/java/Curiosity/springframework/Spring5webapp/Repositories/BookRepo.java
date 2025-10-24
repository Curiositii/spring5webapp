package Curiosity.springframework.Spring5webapp.Repositories;

import Curiosity.springframework.Spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
