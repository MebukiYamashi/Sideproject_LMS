import DAO.MemberDAO;
import DAO.BookDAO;
import DAO.RentalDAO;

public class ManagementController {
    private MemberDAO MemberDAO;
    private BookDAO BookDAO;
    private RentalDAO RentalDAO;

    public ManagementController() {
        this.memberDAO = new MemberDAO();
        this.bookDAO = new BookDAO();
        this.rentalDAO = new RentalDAO();
    }

    // 회원
    public void registerMember(String name, String phoneNumber, String id) throws ValidationException, DuplicationException {
        Member member = new Member(id, name, phoneNumber);
        memberDAO.register(member);
    }

    public Member findMember(String name, String phoneNumber) throws DatabaseException {
        return memberDAO.findMember(name, phoneNumber);
    }

    public void updateMember(String id, String name, String phoneNumber) throws ValidationException, DatabaseException {
        Member member = new Member(id, name, phoneNumber);
        memberDAO.updateMember(member);
    }

    public void deleteMember(String id) throws DatabaseException {
        memberDAO.deleteMember(id);
    }

    // 도서
    public void registerBook(String title, String publisher, String author, String id) throws ValidationException, DuplicationException {
        Book book = new Book(id, title, publisher, author);
        bookDAO.register(book);
    }

    public Book findBook(String title, String publisher, String author) throws DatabaseException {
        return bookDAO.findBook(title, publisher, author);
    }

    public void deleteBook(String id) throws DatabaseException {
        bookDAO.deleteBook(id);
    }

    // 대여
    public List<Rental> viewAllRentals() throws DatabaseException {
        return rentalDAO.viewAllRentals();
    }

    public List<Rental> viewRentalsByMember(String memberId) throws DatabaseException {
        return rentalDAO.viewRentalsByMember(memberId);
    }

    public List<Rental> viewRentalsByBook(String bookId) throws DatabaseException {
        return rentalDAO.viewRentalsByBook(bookId);
    }

    public void rentBook(String memberId, String bookId) throws ValidationException, RentalException, DatabaseException {
        rentalDAO.rentBook(memberId, bookId);
    }

    public void returnBook(String rentalId) throws DatabaseException {
        rentalDAO.returnBook(rentalId);
    }

    public void checkOverdue(String rentalId) throws DatabaseException {
        rentalDAO.checkOverdue(rentalId);
    }
}
