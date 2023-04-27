import java.util.*;
public class Book extends Item{
    protected String author;
    protected String publisher;
    public Book(String title, String genre, String author, String publisher, Date releaseDate, int id) {
        super(title, genre, releaseDate, id);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", publisher=" + publisher +
                ", releaseDate=" + releaseDate +
                ", id=" + id +
                ", available=" + available +
                '}';
    }
}
