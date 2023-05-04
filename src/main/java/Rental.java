import java.util.*;
public class Rental {
    private Item item;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;
    private int id;

    public Rental(Item item, Customer customer, int id) {
        this.item = item;
        this.customer = customer;
        rentalDate = new Date(); // set rental date to current date
        this.id = id;
        item.setAvailable(false);
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
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
        returnDate = date;
        // set the return date of the movie to provided value
    }

    @Override
    public String toString() {
        return "Rental{" +
                item.toString() +
                customer.toString() +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", id=" + id +
                '}';
    }
}
