import java.util.Scanner;

// 별 찍기 - 8
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // 별
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 공백 8->6->4->2->0
            for (int k = 0; k < (2 * n) - (2 * i); k++) {
                System.out.print(" ");
            }
            // 별
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            // 별
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // 공백 2->4->6
            for (int k = 0; k < (2 * i); k++) {
                System.out.print(" ");
            }
            // 별
            for (int l = 0; l < n - i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
