import java.util.*;
public class Movie extends Item{
    private String director;
    private String cast;
    public Movie(String title, String genre, String director, String cast, Date releaseDate, int id, boolean isAvailable) {
        super(title, genre, releaseDate, id, isAvailable);
        this.director = director;
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", cast=" + cast +
                ", releaseDate=" + releaseDate +
                ", id=" + id +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
