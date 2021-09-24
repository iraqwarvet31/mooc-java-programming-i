import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your Film class here
        Scanner reader = new Scanner(System.in);
        Film goonies = new Film("The Goonies", 8);
        
        System.out.println("How old are you?");
        int reply = Integer.valueOf(reader.nextLine());
        
        if (reply >= goonies.ageRating()) {
            System.out.println("You are old enough to watch " + goonies.name());
        } else {
            System.out.println("Sorry come back when your at least " + goonies.ageRating());
        }
    }
}
