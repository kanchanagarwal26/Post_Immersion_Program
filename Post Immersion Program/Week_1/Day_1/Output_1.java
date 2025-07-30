package Week_1.Day_1;

public class Output_1 {

    public static void main(String[] args) {
        fun(40, 4); // Call the function
    }

    public static void fun(Integer w, Integer x) {
        Integer y = 0;

        // Check divisibility condition
        if ((x % w == 0) || (w % x == 0)) {
            y = y + 1;
        } else {
            y = y + 10;
        }

        // Print the result
        System.out.println(y);
    }
}
