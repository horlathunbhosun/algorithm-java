package algorithm;

/**
 * @author olulodeolatunbosun
 * @created 17/05/2024/05/2024 - 16:56
 */
public class Palindrome {

    public static String removeWhiteSpace(String word) {


        // Remove white spaces and convert to lowercase
        //longer way with string builder
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString().toLowerCase();
        //shorter way with string
       // return word.replaceAll("\\s", "").toLowerCase();
    }

    public static boolean isPalindrome(String wordToCheck) {
       String replaceWhiteSpaceInWord = removeWhiteSpace(wordToCheck);
        int left = 0;
        int right = replaceWhiteSpaceInWord.length() - 1;
        while (left < right) {
            if (replaceWhiteSpaceInWord.charAt(left) != replaceWhiteSpaceInWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";
        //a word to check if its not a palindrome
        String word2 = "example";
        System.out.println(isPalindrome(word2) ? "It is a palindrome   " + true : "It is not a palindrome  "+ false );
        System.out.println(isPalindrome(word) ? "It is a palindrome   " + true : "It is not a palindrome  "+ false );
    }


}
