
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldest = "";
        Integer greatest = 0;
        
        while (true) {
            String csv = scanner.nextLine();
            if (csv.isEmpty()) {
                break;
            }
            
            String[] parts = csv.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[parts.length - 1]);
            
            if (age > greatest) {
                greatest = age;
                oldest = name;
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
