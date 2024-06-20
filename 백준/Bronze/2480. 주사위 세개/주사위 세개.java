import java.util.Scanner;

// 주사위 세개
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || b == c) {
            System.out.println(1000 + b * 100);
        } else if (a == c) {
            System.out.println(1000 + a *100);
        } else{
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
        }
    }
}
