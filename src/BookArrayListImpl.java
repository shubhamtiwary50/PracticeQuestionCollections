import java.util.ArrayList;
import java.util.List;

public class BookArrayListImpl {
    public static void main(String[] args) {
        List<Book> booklist = new ArrayList<>();

        Book book1 = new Book("ABC", "RR Martin", 23456787, 1999.00);
        Book book2 = new Book("GHI", "JK Rowling", 12312345, 1499.00);
        Book book3 = new Book("DEF", "Dan Brown", 345234123, 1699.00);
        booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);

        System.out.println(booklist.size());
        // System.out.println(booklist.set(2,booklist.get(0)));
        for (Book element : booklist) {
            System.out.println(element);
        }
        for (int i = 0; i < booklist.size(); i++) {
            for (int j = 0; j < booklist.size() - 1-i; j++) {
                Book temp = booklist.get(j);
                booklist.set(j, booklist.get(j + 1));
                booklist.set(j + 1, temp);
            }
        }
            System.out.println("---------After Sorting-----------");
            for (Book element : booklist)
            {
                System.out.println(element);
            }

    }
}
