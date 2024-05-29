import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Tutunamayanlar", 724, "Oğuz Atay", "1972");
        Book book2 = new Book("Saatleri Ayarlama Ens.", 361, "Ahmet Hamdi Tanpınar", "1961");
        Book book3 = new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", "1943");
        Book book4 = new Book("Araba Sevdası", 272, "Recaizade Mahmud Ekrem", "1897");
        Book book5 = new Book("Serenad", 481, "Zülfü Livaneli", "2011");

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