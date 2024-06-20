import java.util.Scanner;

// 별 찍기 - 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            // 공백
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
