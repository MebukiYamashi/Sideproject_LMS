public class ManagementController {
    private Member memberService;
    private Book bookService;
    private Rental rentalService;
    
    //Member, Book, Rental 객체 생성
    public ManagementController() {
        this.memberService = new Member();
        this.bookService = new Book();
        this.rentalService = new Rental();
    }

    // 회원
    public void registerMember(String name, String phoneNumber, String id) throws ValidationException, DuplicationException {
        memberService.register(name, phoneNumber, id);
    }

    public void findMember(String name, String phoneNumber) throws DatabaseException {
        memberService.findMember(name, phoneNumber);
    }

    public void updateMember(String name, String phoneNumber) throws ValidationException, DatabaseException {
        memberService.updateMember(name, phoneNumber);
    }

    public void deleteMember(String id) throws DatabaseException {
        memberService.deleteMember(id);
    }

    // 도서
    public void registerBook(String title, String publisher, String author, String id) throws ValidationException, DuplicationException {
        bookService.register(title, publisher, author, id);
    }

    public void findBook(String title, String publisher, String author) throws DatabaseException {
        bookService.findBook(title, publisher, author);
    }

    public void deleteBook(String id) throws DatabaseException {
        bookService.deleteBook(id);
    }

    // 대여
    public void viewAllRentals() throws DatabaseException {
        rentalService.viewAllRentals();
    }

    public void viewRentalsByMember(String memberId) throws DatabaseException {
        rentalService.viewRentalsByMember(memberId);
    }

    public void viewRentalsByBook(String bookId) throws DatabaseException {
        rentalService.viewRentalsByBook(bookId);
    }

    public void rentBook(String memberId, String bookId) throws ValidationException, RentalException, DatabaseException {
        rentalService.rentBook(memberId, bookId);
    }

    public void returnBook(String bookId) throws DatabaseException {
        rentalService.returnBook(bookId);
    }

    public void checkOverdue(String bookId) throws DatabaseException {
        rentalService.checkOverdue(bookId);
    }
}
