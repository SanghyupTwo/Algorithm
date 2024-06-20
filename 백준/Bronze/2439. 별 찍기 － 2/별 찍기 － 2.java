import java.util.Scanner;

// 별 찍기 - 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }
}
