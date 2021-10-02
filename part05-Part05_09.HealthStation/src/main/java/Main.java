
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation kaiser = new HealthStation();
        
        Person larry = new Person("Larry", 40, 59, 195);
        
        System.out.println(larry.getName() + " weight: " + kaiser.weigh(larry) + " lbs.");
        kaiser.feed(larry);
        kaiser.feed(larry);
        kaiser.feed(larry);
        kaiser.feed(larry);
        kaiser.feed(larry);
        System.out.println("Larry is fed at kaiser and now weighs: " + larry.getWeight() + " lbs.");
        kaiser.weigh(larry);
        kaiser.weigh(larry);
        kaiser.weigh(larry);
        kaiser.weigh(larry);
        kaiser.weigh(larry);
        System.out.println("Larry performed: " + kaiser.weighings() + " weighings!");
    }
}
