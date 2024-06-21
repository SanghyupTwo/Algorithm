import java.util.Scanner;

// 알파벳 개수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] alphabet = new int[26];
        for (char c : str.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}
