public class Example_2 {

    public static void printPairs(int [] array ){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.println(array[i] + "," + array[j] );
            }
        }
    }
    public static void main(String[] args){
            int[] array = {2};
            printPairs(array);
    }
}

// The inner for loop has o(n) iterations and it called N times.
// Their the run time is O(N^2)