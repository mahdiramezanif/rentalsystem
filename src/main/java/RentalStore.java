import java.util.*;
public class RentalStore {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Movie> movies = new ArrayList<Movie>();

    public RentalStore() {
    }
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
            customer.rentals.add(new Rental(movie,customer,
                    Integer.parseInt(customer.getId() +Integer.toString(movie.getId()))));
        }
    }
    public void returnMovie(Rental rental){
        boolean correctRental = false;
        for (Rental r:rental.getCustomer().rentals) {
            if (r==rental){
                correctRental = true;
                break;
            }
        }
        if (correctRental){
            rental.getMovie().setAvailable(true);
            this.getAvailableMovies().add(rental.getMovie());
            rental.getCustomer().rentals.remove(rental);
        }
        else
            System.out.println("There is no any rental by this customer ! ");
    }
    public Customer getCustomerById(int id){
        for (Customer c:customers) {
            if (c.getId()==id)
                return c;
        }
        System.out.println("There is no customer with this id !");
        return null;
    }
    public Movie getMovieById(int id){
        for (Movie m:movies) {
            if (m.getId()==id)
                return m;
        }
        System.out.println("There is no movie with this id !");
        return null;
    }
}
