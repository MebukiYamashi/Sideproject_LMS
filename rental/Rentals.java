package rental;

import Member.Members;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {
    private static Rentals allRentals;

    private Rentals() {}

    public static Rentals getInstance() {
        if (allRentals == null) {
            allRentals = new Rentals();
        }
        return allRentals;
    }

}
