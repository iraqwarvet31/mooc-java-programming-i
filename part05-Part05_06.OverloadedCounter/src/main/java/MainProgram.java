
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter d = new Counter(10);
        Counter i = new Counter();
        
        d.decrease();
        d.decrease();
        d.decrease();
        System.out.println("Counter 'd' value is now: " + d.value());
        
        i.increase();
        i.increase();
        i.increase();
        i.increase();
        i.increase();
        System.out.println("Counter 'i' value is now: " + i.value());
        
        d.decrease(5);
        System.out.println("Decrease by 5: " + d.value());
        
        i.increase(5);
        System.out.println("Increase by 5: " + i.value());
    }
}
