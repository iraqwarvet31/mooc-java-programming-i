
public class Program {

    public static void main(String[] args) {
        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:

        Book b = new Book("KonMari", "Marie Kondo", 222);
        System.out.println(b);
        
        System.out.println("Name: " + b.getName());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Pages: " + b.getPages());
    }
}
