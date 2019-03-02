package repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import domain.Book;

@Repository
public interface BookRepositoryMongoDb extends MongoRepository<Book, Long> {

	public Book findByIsbn(Long isbn);

	public List<Book> findByBooks();

}
