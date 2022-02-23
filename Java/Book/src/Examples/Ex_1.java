package Examples;

public class Ex_1 {

    /* Exercise 1 */
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(4));

        /*
         * sum(4)
         *   --> sum(3)
         *       --> sum(2)
         *           --> sum(1)
         *               --> sum(0)
         * */
        /**
         * Each of these calls is added to the call stack and takes up actual memory
         * */
    }
}
