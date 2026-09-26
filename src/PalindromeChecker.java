public class PalindromeChecker {

    // Check whether a String is a palindrome
    public static boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            // Compare characters from both ends
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word1 = "racecar";
        String word2 = "level";
        String word3 = "hello";

        System.out.println(word1 + " -> " + isPalindrome(word1));
        System.out.println(word2 + " -> " + isPalindrome(word2));
        System.out.println(word3 + " -> " + isPalindrome(word3));
    }
}