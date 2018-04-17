public class Ex_2 {

    public static int pairSumSequence(int n){

            int sum = 0; // Creating a local variable here and setting it to 0;

            for(int i= 0; i < n; i++){
                sum += pairSum(i, i +1);
            }
        return sum;
    }

    public static int pairSum(int a, int b) {
        return a + b;
    }

    public static void main (String[] args) {
        //System.out.println("Hello I Work!");
        System.out.println(pairSumSequence(5));
    }

    /**
     * There will be roughly O(n) calls to pairSum. However, those calls do not exist simultaneously
     * */
}
