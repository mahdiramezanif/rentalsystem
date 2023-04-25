import java.util.*;
public class Rental {
    private Movie movie;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;
    private int id;

    public Rental(Movie movie, Customer customer, int id) {
        this.movie = movie;
        this.customer = customer;
        rentalDate = new Date(); // set rental date to current date
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date date) {
        returnDate = date; // set the return date of the movie to provided value
    }

    public double calculateLateFee() {
        // calculate late fee for the rental
    }
}
