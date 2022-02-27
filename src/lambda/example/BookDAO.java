package lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "CoreJava", 400));
		books.add(new Book(363, "Hibernate", 180));
		books.add(new Book(275, "Spring", 400));
		books.add(new Book(893, "WebService", 400));
		return books;
	}
}
