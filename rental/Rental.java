package rental;

import java.time.LocalDate;
import java.util.Objects;

public class Rental {
    private String bookID;
    private String memberID;
    private LocalDate rentalDate;

    public Rental() {
        this.rentalDate = LocalDate.now();
    }

    public Rental(String bookID, String memberID) {
        this.bookID = bookID;
        this.memberID = memberID;
        this.rentalDate = LocalDate.now();
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return Objects.equals(bookID, rental.bookID) && Objects.equals(memberID, rental.memberID) && Objects.equals(rentalDate, rental.rentalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID, memberID, rentalDate);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "bookID='" + bookID + '\'' +
                ", memberID='" + memberID + '\'' +
                ", rentalDate=" + rentalDate +
                '}';
    }

}
