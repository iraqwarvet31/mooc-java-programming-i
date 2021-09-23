
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String result = "";
        
        for (int num : array) {
            int last = array[array.length -1];
            
            if (num == last) {
                result += num; 
            } else {
                result += num + ", ";
            }
        }
        System.out.println(result);
    }
}
