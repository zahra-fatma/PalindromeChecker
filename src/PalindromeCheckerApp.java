import java.util.Scanner;

public class PalindromeCheckerApp {

   
    public static boolean isPalindrome(String word, int start, int end) {

       
        if (start >= end) {
            return true;
        }

       
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

       
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}