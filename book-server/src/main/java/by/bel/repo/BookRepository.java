package by.bel.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import by.bel.domain.Book;

@RepositoryRestResource(path = "book")
public interface BookRepository extends MongoRepository<Book, String > {

}
