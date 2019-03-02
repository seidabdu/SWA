package greet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.Book;
import repository.BookRepository;
import repository.BookRepositoryMongoDb;

@RestController
public class BookServiceMongoDb {

	@Autowired
	private BookRepositoryMongoDb bookRepositoryMongoDb;

	@PostMapping(value = "/mongodb/add/book")
	public ResponseEntity<?> getGreeting(@RequestBody Book book) {
		
		bookRepositoryMongoDb.save(book);		
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

//	@DeleteMapping("/books/delete/{isbn}")
//	public ResponseEntity<?> deleteBook(@PathVariable Long isbn) {
//		if (null == bookRepository.deleteBook(isbn)) {
//			return new ResponseEntity("No book found for ISBN " + isbn, HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity(isbn, HttpStatus.OK);
//
//	}

//	@RequestMapping(value = "/books/", method = RequestMethod.GET)
//	public ResponseEntity<List<Book>> getBooks() {
//		List<Book> books = bookRepository.getALlBooks();
//		if (books.isEmpty()) {
//			return new ResponseEntity(HttpStatus.NO_CONTENT);
//			// You many decide to return HttpStatus.NOT_FOUND
//		}
//		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
//
//	}

//	@GetMapping("/book/get/{isbn}}")
//	public ResponseEntity getBook(@PathVariable("isbn") Long isbn) {
//
//		Optional<Book> b = bookRepository.getBook(isbn);
//		if (b == null) {
//			return new ResponseEntity("No book found for ISBN " + isbn, HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity(b, HttpStatus.OK);
//
//	}

}
