import java.util.Scanner;

public class AdaLovelace {

    public static void main(String[] args) {
        // Write your program here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int year = Integer.valueOf(input.nextLine());
        
        if (year == 1984) {
            System.out.println("Orwell");
        }
         
    }
}
