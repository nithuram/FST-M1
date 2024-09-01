package Activities;

import java.io.PrintStream;

public class Activity2 {
    public static void main(String[] args) {
        int sum = 0;
        int expected = 30;
        int[] arr = new int[]{10, 77, 10, 54, -11, 10};

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == 10) {
                sum += arr[i];
            }
        }

        PrintStream var10000 = System.out;
        boolean var10001 = result(sum, expected);
        var10000.println("Result " + var10001);
    }

    public static boolean result(int sum, int expected) {
        return sum == expected;
    }
}
