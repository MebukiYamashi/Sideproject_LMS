package Book;

import java.util.ArrayList;

public class Books extends ArrayList<Book> {

    private static Books allBooks;

    private Books () {}

    public static Books getInstance() {
        if (allBooks == null) {
            allBooks = new Books();
        }
        return allBooks;
    }

}
