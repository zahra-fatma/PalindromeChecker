import java.util.*;

public class PalindromeCheckerApp {

    public static void reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        input.equals(reversed);
    }


    public static void stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            stack.pop();
        }
    }

    public static void dequeMethod(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            deque.removeFirst();
            deque.removeLast();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        reverseMethod(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        stackMethod(input);
        long end2 = System.nanoTime();


        long start3 = System.nanoTime();
        dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nExecution Time (nanoseconds)");

        System.out.println("Reverse Method  : " + (end1 - start1));
        System.out.println("Stack Method   : " + (end2 - start2));
        System.out.println("Deque Method   : " + (end3 - start3));

        scanner.close();
    }
}