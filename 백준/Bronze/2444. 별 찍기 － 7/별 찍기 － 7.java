import java.util.Scanner;

// 별 찍기 - 7
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 0; k < 1 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            // 공백
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 0; k < 1 + 2 * (n - i - 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
