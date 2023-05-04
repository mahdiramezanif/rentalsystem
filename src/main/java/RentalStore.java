import java.util.*;
public class RentalStore {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Item> Items = new ArrayList<Item>();

    public RentalStore() {
    }
    public void register(Customer customer){
        this.customers.add(customer);
    }
    public void addItem(Item Item){
        this.Items.add(Item);
    }
    public void removeItem(Item Item){
        this.Items.remove(Item);
    }
    public ArrayList<Item> getAvailableItems(){
        ArrayList<Item> availableItems = new ArrayList<Item>();
        for (Item i:Items) {
            if (i.isAvailable()==true)
                availableItems.add(i);
        }
        return availableItems;
    }
    public void rentItem(Customer customer, Item Item){
        if (Item.isAvailable()==false){
            System.out.println("This Item already is rented! ");
        }
        else {
            this.getAvailableItems().remove(Item);
            customer.rentals.add(new Rental(Item,customer,
                    Integer.parseInt(customer.getId() +Integer.toString(Item.getId()))));
        }
    }
    public void returnItem(Rental rental){
        boolean correctRental = false;
        for (Rental r:rental.getCustomer().rentals) {
            if (r==rental){
                correctRental = true;
                break;
            }
        }
        if (correctRental){
            rental.getItem().setAvailable(true);
            this.getAvailableItems().add(rental.getItem());
            rental.getCustomer().rentals.remove(rental);
            rental.setReturnDate(new Date());
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
    public Item getItemById(int id){
        for (Item i:Items) {
            if (i.getId()==id)
                return i;
        }
        System.out.println("There is no Item with this id !");
        return null;
    }
}
