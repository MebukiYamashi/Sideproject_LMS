package book;

public class Book {

    private String bookName;
    private String author;
    private String publisher;
    private String bookID;

    public Book(String bookName, String author, String publisher, String bookID) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
}
