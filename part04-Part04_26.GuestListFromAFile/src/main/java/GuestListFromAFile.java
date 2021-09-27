
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for file name
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        // Array of strings from file
        ArrayList<String> list = new ArrayList<>();
        System.out.println("");
        
        // Read the file and place each row in list array
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Ask user for a name
        System.out.println("Enter names, an empty line quits.");
        
        // Check for name in list and handle accordingly
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
