import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RentalStore rentalStore = new RentalStore();
        Movie movie = new Movie("t","g","d",new ArrayList<String>(Arrays.asList("Arnold","me")),new Date(),5);
        rentalStore.addMovie(movie);
        Customer customer = new Customer("n","e","0","a",9);
        rentalStore.register(customer);
        rentalStore.getAvailableMovies();
        rentalStore.rentMovie(customer,movie);
        for (Rental r:customer.getRentals()) {
            System.out.println(r.toString());
        }
    }
}
