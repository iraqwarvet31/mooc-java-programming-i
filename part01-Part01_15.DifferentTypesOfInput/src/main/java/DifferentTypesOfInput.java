
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write a string
        System.out.println("Give a string:");
        String str = scan.nextLine();
        
        // Write an integer
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        
        // Write a double
        System.out.println("Give a double:");
        double flt = Double.valueOf(scan.nextLine());
        
        // Write a boolean
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());
        
        // print all types with a message
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + flt);
        System.out.println("You gave the boolean " + bool);
    }
}
