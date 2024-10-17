import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Deque<Character> str = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            str.addLast(ch);
        }

        if (str.getFirst() == '\"' && str.getLast() == '\"') {
            str.pollFirst();
            str.pollLast();
            if (str.size() > 2) {
                for (Character c : str) {
                    System.out.print(c);
                }
            } else {
                System.out.println("CE");
            }

        } else {
            System.out.println("CE");
        }

    }
}