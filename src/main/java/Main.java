import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Reader reader = new FileReader("D:\\Learning\\University\\planing\\code\\Java\\RentalSystem\\TestYourFork.json");
        AllModules allModulesList = gson.fromJson(reader, new TypeToken<AllModules>() {
        }.getType());
        reader.close();

        Customer firstCustomer = allModulesList.customers.get(0);
        Customer secoundCustomer = allModulesList.customers.get(1);
        Customer thirdCustomer = allModulesList.customers.get(2);

        RentalStore bookStore = new RentalStore();
        for (Item b:allModulesList.books) {
            bookStore.addItem(b);
        }
        RentalStore gameStore = new RentalStore();
        for (Item g:allModulesList.games) {
            gameStore.addItem(g);
        }

        Book book1 = (Book) bookStore.getItemById(3);
        Book book2 = (Book) bookStore.getItemById(6);
        bookStore.rentItem(firstCustomer,book1);
        bookStore.rentItem(firstCustomer,book2);

        Book book3 = (Book) bookStore.getItemById(1);
        Book book4 = (Book) bookStore.getItemById(7);
        bookStore.rentItem(secoundCustomer,book3);
        bookStore.rentItem(secoundCustomer,book4);

        Book book5 = (Book) bookStore.getItemById(9);
        Game game = (Game) gameStore.getItemById(4);
        bookStore.rentItem(thirdCustomer,book5);
        gameStore.rentItem(thirdCustomer,game);

        Gson writing = new Gson();
        String json = writing.toJson(allModulesList);
        String path = "D:\\Learning\\University\\planing\\code\\Java\\RentalSystem\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(json);
            writer.close();
        } catch (IOException | JsonIOException e) {
            throw new RuntimeException(e);
        }
    }
}
