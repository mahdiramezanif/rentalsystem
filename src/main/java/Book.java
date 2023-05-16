import java.util.*;
public class Book extends Item{
    protected String author;
    protected String publisher;
    public Book(int id,String title, String genre, Date releaseDate, boolean isAvailable, String author, String publisher) {
        super(title, genre, releaseDate, id, isAvailable);
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
                ", isAvailable=" + isAvailable +
                '}';
    }
}
