import java.util.Scanner;

// 에너그램 만들기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] alphabet = new int[26];
        for (char c : str1.toCharArray()) {
            alphabet[c - 'a'] ++;
        }
        for (char c : str2.toCharArray()) {
            alphabet[c - 'a'] --;
        }
        int ans = 0;
        for (int i : alphabet) {
            if (i != 0) ans += Math.abs(i);
        }
        System.out.println(ans);
    }
}
