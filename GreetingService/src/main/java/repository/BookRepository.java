package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import domain.Book;


@Repository
public class BookRepository {

	private List<Book> booklist = new ArrayList<>();

	public BookRepository() {

	}

	public void addBook(Book english) {
		this.booklist.add(english);
	}

	public List<Book> getALlBooks() {
		return booklist;
	}

	public Optional<Book> getBook(long isbn) {
		return booklist.stream().filter(book -> book.getIsbn() == isbn).findFirst();
	}

	@SuppressWarnings("unlikely-arg-type")
	public Optional<Book> deleteBook(long isbn) {
		Optional<Book> delbook = getBook(isbn);
		this.booklist.remove(delbook);
		
		return delbook;
	}

}
