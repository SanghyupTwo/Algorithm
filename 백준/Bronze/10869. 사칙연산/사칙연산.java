import java.util.Scanner;

// 사칙연산
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.printf("%d%n%d%n%d%n%d%n%d", a + b, a - b, a * b, a / b, a % b);
    }
}
