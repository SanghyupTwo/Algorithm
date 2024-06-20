import java.util.Scanner;

// 별 찍기 - 3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
