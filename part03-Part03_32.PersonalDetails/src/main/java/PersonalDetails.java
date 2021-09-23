
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> users = new ArrayList<>();
        int sum = 0;
        String longest = "";
        
        while (true) {
            String user = scanner.nextLine();
            
            if (user.isEmpty()) {
                break;
            }
            users.add(user);
        }
        
        for (String item : users) {
            String[] pieces = item.split(",");
            String name = pieces[0];
            int year = Integer.valueOf(pieces[1]);
            
            if (name.length() > longest.length()) {
                longest = name;
            }
            sum += year;
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (double) sum / users.size());
    }
}
