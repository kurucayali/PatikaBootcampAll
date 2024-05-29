package BookSorter;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", 310, "J.R.R. Tolkien", "1937");
        Book book2 = new Book("1984", 328, "George Orwell", "1949");
        Book book3 = new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960");
        Book book4 = new Book("Pride and Prejudice", 279, "Jane Austen", "1813");
        Book book5 = new Book("Moby-Dick", 635, "Herman Melville", "1851");

        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(book1);
        booksByName.add(book2);
        booksByName.add(book3);
        booksByName.add(book4);
        booksByName.add(book5);

        System.out.println("Books sorted by name:");
        printTableHeader();
        for (Book book : booksByName) {
            System.out.println(book);
        }
        printTableFooter();

        Set<Book> booksByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        booksByPageCount.addAll(booksByName);

        System.out.println("\nBooks sorted by page count:");
        printTableHeader();
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
        printTableFooter();
    }

    //Çıktıları tablo şeklinde gösterebilmek adına bu fonksiyonları yazıp ihtiyaç halinde çağıracağız.
    private static void printTableHeader() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("| Name                    | Page Count | Author           | Publish Date |");
        System.out.println("--------------------------------------------------------------------------------");
    }

    private static void printTableFooter() {
        System.out.println("--------------------------------------------------------------------------------");
    }
}
