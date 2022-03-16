package Chapter1_Arrays_Strings;

/**
 * 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other
 */
public class Q1_2 {
    boolean checkPermutation(String word1, String word2) {

        // Lets do out basic checks first
        if (
                word1 == null ||
                        word2 == null ||
                        word1.length() != word2.length()) {
            System.out.println("These two can not be permutation of each other");
            return false;
        }

        int[] letters = new int[128]; // i dont know why 128

        char[] s_array = word1.toCharArray();

        for (char c : s_array) { // count the number of each char in word 1
            letters[c]++; // push them to the letters.
        }

        for (int i = 0; i < word1.length(); i++) {
            int c = word2.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    // We are using a sorting algorithm here
    String sort(String word) {
        char[] content = word.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    boolean checkPermutationSort(String word1, String word2) {
        if (word1 == null || word2 == null || word1.length() != word2.length()) {
            System.out.println("These two can not be permutation of each other");
            return false;
        }
        return sort(word1).equals(sort(word2));
    }

    public static void main(String args[]) {
        Q1_2 permutation = new Q1_2();


        System.out.println(permutation.checkPermutation("pass", "saps"));
        System.out.println(permutation.checkPermutationSort("god", "dog"));
    }
}
