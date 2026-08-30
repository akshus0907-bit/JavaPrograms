import java.util.*;

class Book {
    private int bookId;
    private String bookName;
    private int price;

    public Book() {
    }

    public Book(int bookId, String bookName, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class BookApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        Vector<Book> v = new Vector<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Book Id, Book Name and Price:");

            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();

            Book b = new Book(id, name, price);
            v.add(b);
        }

        int total = 0;

        Iterator<Book> itr = v.iterator();

        while (itr.hasNext()) {
            Book b = itr.next();
            total = total + b.getPrice();
        }

        System.out.println("Total Book Price = " + total);

        sc.close();
    }
}