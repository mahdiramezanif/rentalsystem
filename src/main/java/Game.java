import java.util.*;
public class Game extends Item{
    protected String platform;
    protected String publisher;
    public Game(String title, String genre, String platform, String publisher,
                Date releaseDate, int id, boolean isAvailable) {
        super(title, genre, releaseDate, id, isAvailable);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }
    public String getPublisher() {
        return publisher;
    }
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", platform='" + platform + '\'' +
                ", publisher=" + publisher +
                ", releaseDate=" + releaseDate +
                ", id=" + id +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
