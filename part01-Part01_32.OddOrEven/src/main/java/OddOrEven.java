
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        // Write your program here 
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        
        if (num % 2 == 0) {
            answer = "even";
        } else {
            answer = "odd";
        }
        System.out.println("Number " + num + " is " + answer);
    }
}
