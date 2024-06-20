import java.util.Scanner;

// 별 찍기 - 6
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 1 + 2 * (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
