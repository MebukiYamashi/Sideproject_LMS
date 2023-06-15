package method;

import Book.Books;
import Book.Book;

import java.util.Scanner;

public class BookMethod {

    Scanner sc = new Scanner(System.in);
    private final Books allBooks = Books.getInstance();

    public void registerBook(String bookID, String title, String author, String publisher) {
        Book book = new Book(bookID, title, author, publisher);
        allBooks.add(book);
    }

    public void findBookByBookID() {
        System.out.print("찾을 책의 ID를 입력하세요: ");
        String bookID = sc.next();
        for (int i = 0; i < allBooks.size(); i++) {
            if ( bookID.equals(allBooks.get(i).getBookID()) ) {
                System.out.println(allBooks.get(i));
                break;
            }
        }
    }

    public void deleteBookByBookID() {
        System.out.print("삭제할 책 ID를 입력하세요: ");
        String bookID = sc.next();
        for (int i = 0; i < allBooks.size(); i++) {
            if ( bookID.equals(allBooks.get(i).getBookID()) ) {
                allBooks.remove(i);
                break;
            }
        }
    }

}
