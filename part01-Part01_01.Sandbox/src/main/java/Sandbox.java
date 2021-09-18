import java.util.Scanner;

public class Sandbox {

   public static void printStars(int number) {
       for (int i = 1; i <= number; i++) {
           System.out.print("*");
       }
       System.out.println();
   }
   
   public static void printSquares(int size) {
       for (int i = 1; i <= size; i++) {
           printStars(size);
       }
   }
   
   public static void printRectangle(int width, int height) {
       for (int i = 1; i <= height; i++) {
           printStars(width);
       }
   }
   
   public static void printTriangle(int size) {
       for (int i = 1; i <= size; i++){
           printStars(i);
       }
   }

    public static void main(String[] args) {
//        printStars(5);
//        printStars(3);
//        printStars(9);
        
//        printSquares(4);
//          printRectangle(17, 3);
          printTriangle(4);
    }
}
