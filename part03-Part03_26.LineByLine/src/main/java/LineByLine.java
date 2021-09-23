
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(" ");
            
            for (String word : pieces) {
                System.out.println(word);
            }
        }
    }
}
