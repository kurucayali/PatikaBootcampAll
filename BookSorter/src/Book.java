

public class Book implements Comparable<Book> {
    private String name;
    private int pageCount;
    private String author;
    private String publishDate;

    public Book(String name, int pageCount, String author, String publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("| %-22s | %-10d | %-16s | %-10s |", name, pageCount, author, publishDate);
    }

}