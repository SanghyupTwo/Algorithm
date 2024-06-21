import java.util.Scanner;

// 별 찍기 - 7
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 공백
            System.out.print(" ".repeat(n - i));
            // 별
            System.out.print("*".repeat(2 * i - 1));
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            // 공백
            System.out.print(" ".repeat(i));
            // 별
            System.out.print("*".repeat(2 * (n - i) - 1));
            System.out.println();
        }
    }
}
