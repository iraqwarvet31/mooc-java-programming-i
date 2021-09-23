
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();
            
            if (phrase.isEmpty()) {
                break;
            }
            String[] pieces = phrase.split(" ");
            
            for (String word : pieces) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
