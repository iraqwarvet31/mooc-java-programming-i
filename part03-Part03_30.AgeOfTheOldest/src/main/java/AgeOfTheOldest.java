
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String phrase = scanner.nextLine();
            
            if (phrase.isEmpty()) {
                break;
            }
            String[] parts = phrase.split(",");
            int a = Integer.valueOf(parts[1]);
            if (a > oldest) {
                oldest = a;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
