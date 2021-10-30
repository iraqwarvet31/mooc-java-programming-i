import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack larrysStack = new Stack();
        larrysStack.add("one");
        larrysStack.add("two");
        larrysStack.add("three");
        larrysStack.add("four");
        System.out.println(larrysStack.take());
        System.out.println(larrysStack.values());
    }
}
