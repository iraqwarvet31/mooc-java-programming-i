
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String name = row.split(",")[0];
                int age = Integer.valueOf(row.split(",")[1]);
                String wordYear;
                
                if (age > 1 || age == 0) {
                    wordYear = "years";
                } else {
                    wordYear = "year";
                }
                System.out.println(name + ", age: " + age + " " + wordYear);
            }
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
