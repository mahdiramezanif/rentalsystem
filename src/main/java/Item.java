import java.util.*;
public class Item {
    protected String title;
    protected String genre;
    protected Date releaseDate;
    protected int id;
    protected boolean available;
    public Item(String title, String genre, Date releaseDate, int id) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.id = id;
        available = true; // by default item is available for rent
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean status) {
        available = status; // set availability status of the movie
    }
}
