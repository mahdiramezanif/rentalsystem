import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson(); // create a new Gson object.
        Reader reader = new FileReader("TestYourFork.json"); // open the input file.

        // Read the JSON data into separate lists for each type of object
        Map<String, Object> data = gson.fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
        List<Book> books = gson.fromJson(gson.toJson(data.get("books")), new TypeToken<List<Book>>(){}.getType());
        List<Game> games = gson.fromJson(gson.toJson(data.get("games")), new TypeToken<List<Game>>(){}.getType());
        List<Customer> customers = gson.fromJson(gson.toJson(data.get("customers")), new TypeToken<List<Customer>>(){}.getType());

        reader.close();

        ArrayList<Rental> rentals = new ArrayList<>();

        Customer customer = null;

        for (Customer c : customers) {
            if (c.getId()==1){
                customer = c;
                break;
            }
        }
        for (Book b:books) {
            if (b.getId()==3)
                rentals.add(new Rental(b,customer,1));

            if (b.getId()==6)
                rentals.add(new Rental(b,customer,2));
        }

        for (Customer c : customers) {
            if (c.getId()==2){
                customer = c;
                break;
            }
        }
        for (Book b:books) {
            if (b.getId()==1)
                rentals.add(new Rental(b,customer,3));

            if (b.getId()==7)
                rentals.add(new Rental(b,customer,4));
        }
        for (Customer c : customers) {
            if (c.getId()==3){
                customer = c;
                break;
            }
        }
        for (Book b:books) {
            if (b.getId()==9)
                rentals.add(new Rental(b,customer,5));
        }
        for (Game g:games) {
            if (g.getId()==4)
                rentals.add(new Rental(g,customer,6));
        }

        for (Rental r:rentals) {
            System.out.println(r.toString());
        }

    }
}
