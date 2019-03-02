package repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import domain.Book;

public interface CustomerRepository extends MongoRepository<Book, Long> {

	public Book findByIsbn(Long isbn);

	public List<Book> findByBooks();

}
