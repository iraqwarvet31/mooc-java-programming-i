import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            // Get title from user
            System.out.print("Title: ");
            String title = scan.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            // Get number of pages from user
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            
            // Get publication year from user
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String reply = scan.nextLine();
        
        if (reply.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            } 
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
