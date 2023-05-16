import java.util.*;
public class Item {
    protected int id;
    protected String title;
    protected String genre;
    protected Date releaseDate;
    protected boolean isAvailable;
    public Item(String title, String genre, Date releaseDate, int id, boolean isAvailable) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.id = id;
        this.isAvailable = isAvailable; // by default item is isAvailable for rent
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
        return isAvailable;
    }
    public void setAvailable(boolean status) {
        isAvailable = status; // set availability status of the movie
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
