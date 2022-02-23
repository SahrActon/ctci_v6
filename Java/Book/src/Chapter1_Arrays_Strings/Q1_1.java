package Chapter1_Arrays_Strings;

/**
 * Question : Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */
public class Q1_1 {

    /*Brut Force*/
    /* What is the time and space complexity
     * Time: 0(n^2) - Due to the for loop
     * Space: 0(n^2) - Due to the for loop
     * */

    // If at any time we encounter 2 same characters, we will return false
    boolean isUnique1(String input) {
        long startTime = System.nanoTime(); //Start
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
        long stopTime = System.nanoTime(); // Stop
        System.out.println("The code took: " + (stopTime - startTime));
        return true;

    }


    /* What is the time and space complexity
     * Time: 0(n) - Due to the for loop
     * Space: 0(n) - Due to the for loop
     * */
    boolean isUnique2(String input) {
        long startTime = System.nanoTime(); //Start
        // Here we are checking some conditions
        if (input == null || input.length() > 256) {
            return false;
        }
        boolean[] map = new boolean[256];
        char[] chars = input.toCharArray();

        for (char c : chars) {
            if (map[c]) {
                return false;
            }
            map[c] = true;
        }
        long stopTime = System.nanoTime(); // Stop
        System.out.println("The code took: " + (stopTime - startTime));
        return true;
    }

    public static void main(String[] args) {
        Q1_1 question_1 = new Q1_1();
        String myString = "abcd10jk";
        String myString2 = "Thomasa";

        System.out.println(question_1.isUnique1(myString));
        System.out.println();
        System.out.println(question_1.isUnique2(myString));


    }
}
