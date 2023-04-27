import java.util.*;
public class Movie extends Item{
    private String director;
    private List<String> cast;
    public Movie(String title, String genre, String director, List<String> cast, Date releaseDate, int id) {
        super(title, genre, releaseDate, id);
        this.director = director;
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getCast() {
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
                ", available=" + available +
                '}';
    }
}
