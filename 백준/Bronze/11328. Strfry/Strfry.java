import java.util.Scanner;

// Strfry
public class Main {
    public static void main(String[] args) {
        // 알파벳 배열을 이용하면 쉽게 풀 수 있을듯
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] alphabet = new int[26];
            String str1 = sc.next();
            String str2 = sc.next();

            for (char c : str1.toCharArray()) {
                alphabet[c - 'a']++;
            }
            for (char c : str2.toCharArray()) {
                alphabet[c - 'a']--;
            }
            boolean res = true;
            for (int a : alphabet) {
                if (a != 0) {
                    res = false;
                    break;
                }

            }
            System.out.println(res ? "Possible" : "Impossible");
        }
    }
}
