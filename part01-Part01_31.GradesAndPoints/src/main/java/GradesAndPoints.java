
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        // write program
        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        
        // Comparision to find grade
        if (grade < 0) {
            answer = "impossible!";
        } else if (grade < 50) {
            answer = "failed";
        } else if (grade < 60) {
            answer = "1";
        } else if (grade < 70) {
            answer = "2";
        } else if (grade < 80) {
            answer = "3";
        } else if (grade < 90) {
            answer = "4";
        } else if (grade < 101) {
            answer = "5";
        } else {
            answer = "incredible!";
        }
        
        // Print the grade
        System.out.println("Grade: " + answer);
    }
}
