package Examples;

public class Example_1 {

    public static void foo(int[] array) {
        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println(sum);
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        int[] array1 = {20};
        foo(array1);
    }
}

// This will take 0(n) time.
// The face that we iterate through the array twice doesn't matter.