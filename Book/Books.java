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

    @Override
    public String toString() {
        String toStr = "";
        for (int i = 0; i < allBooks.size(); i++) {
            toStr += (allBooks.get(i) + "\n");
        }
        return toStr;
    }
}
