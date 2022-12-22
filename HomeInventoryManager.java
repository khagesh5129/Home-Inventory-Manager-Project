import java.util.ArrayList;
import java.util.Scanner;

public class HomeInventoryManager {
  public static void main(String[] args) {
    ArrayList<String> inventory = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Welcome to the home inventory manager.");
      System.out.println("1. Add item");
      System.out.println("2. Remove item");
      System.out.println("3. View inventory");
      System.out.println("4. Quit");

      int choice = scanner.nextInt();

      if (choice == 1) {
        // Add item
        System.out.println("Enter the item to add: book ");
        String item = scanner.next();
        inventory.add(item);
        System.out.println("Item added.");
      } else if (choice == 2) {
        // Remove item
        System.out.println("Enter the item to remove: ");
        String item = scanner.next();
        if (inventory.contains(item)) {
          inventory.remove(item);
          System.out.println("Item removed.");
        } else {
          System.out.println("Item not found.");
        }
      } else if (choice == 3) {
        // View inventory
        System.out.println("Inventory: ");
        for (String item : inventory) {
          System.out.println(item);
        }
      } else if (choice == 4) {
        // Quit
        break;
      } else {
        System.out.println("Invalid choice.");
      }
    }
  }
}
