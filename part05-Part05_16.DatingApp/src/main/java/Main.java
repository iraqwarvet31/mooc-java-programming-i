
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate larry = new SimpleDate(30, 9, 1981);
        SimpleDate araceli = new SimpleDate(22, 8, 1986);
        System.out.println(larry.before(araceli));
        
        larry.advance();
        System.out.println(larry);
        
        
    }
}
