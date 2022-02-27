package lambda.example;

import java.util.Collections;
import java.util.List;

public class BookService {

	// we need to sort the list of books based on name

//	public List<Book> getBooksinSort() {
//		List<Book> books = new BookDAO().getBooks();
//		Collections.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return o2.getName().compareTo(o1.getName());
//			}
//		});
//		return books;
//	}

	// lambda exp can be used for functional interfaces
	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new BookService().getBooksinSort());
	}

}

//class MyComparator implements Comparator<Book> {
//   @Override
//	public int compare(Book o1, Book o2) {
//		return o2.getName().compareTo(o1.getName());
//	}
//
//}
