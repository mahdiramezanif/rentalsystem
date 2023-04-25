import java.util.*;
public class Movie {
    private String title;
    private String genre;
    private String director;
    private List<String> cast;
    private Date releaseDate;
    private int id;
    private boolean available;

    public Movie(String title, String genre, String director, List<String> cast, Date releaseDate, int id) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.id = id;
        available = true; // by default movie is available for rent
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

    public String getDirector() {
        return director;
    }

    public List<String> getCast() {
        return cast;
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
