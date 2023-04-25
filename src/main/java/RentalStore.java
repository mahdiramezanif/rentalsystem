import java.util.*;
public class RentalStore {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Movie> movies = new ArrayList<Movie>();
    public void register(Customer customer){
        this.customers.add(customer);
    }
    public void addMovie(Movie movie){
        this.movies.add(movie);
    }
    public void removeMovie(Movie movie){
        this.movies.remove(movie);
    }
    public ArrayList<Movie> getAvailableMovies(){
        ArrayList<Movie> availableMovies = new ArrayList<Movie>();
        for (Movie m:movies) {
            if (m.isAvailable()==true)
                availableMovies.add(m);
        }
        return availableMovies;
    }
    public void rentMovie(Customer customer, Movie movie){
        if (movie.isAvailable()==false){
            System.out.println("This movie already is rented! ");
        }
        else {
            movie.setAvailable(false);
            this.getAvailableMovies().remove(movie);

        }
    }
}
