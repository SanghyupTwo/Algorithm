import java.util.Scanner;

// 별 찍기 - 6
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat(1 + 2 * (n - i -1)));
            System.out.println();
        }
    }
}
