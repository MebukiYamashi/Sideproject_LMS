package DAO;

import java.sql.*;

import Book.Book;

public class BookDAO {

    private final String url = "jdbc:mysql://localhost:3306/lib_management";
    private final String user = "root";
    private final String password = "password";

    public void register(Book book) throws ValidationException, DuplicationException {
        String query = "INSERT INTO Book (title, publisher, author) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getPublisher());
            pstmt.setString(3, book.getAuthor());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new ValidationException("Error registering book", e);
        }
    }

    public Book findBook(String title, String publisher, String author) throws DatabaseException {
        String query = "SELECT * FROM Book WHERE title = ? AND publisher = ? AND author = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, title);
            pstmt.setString(2, publisher);
            pstmt.setString(3, author);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Book(rs.getString("id"), rs.getString("title"), rs.getString("publisher"), rs.getString("author"));
            } else {
                throw new DatabaseException("Book not found");
            }
        } catch (SQLException e) {
            throw new DatabaseException("Error finding book", e);
        }
    }

    public void deleteBook(String id) throws DatabaseException {
        String query = "DELETE FROM Book WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException("Error deleting book", e);
        }
    }
}
