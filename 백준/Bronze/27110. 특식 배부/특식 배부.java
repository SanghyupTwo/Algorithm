import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 각각 치킨 최대 개수
        int n = sc.nextInt();

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println((a > n ? n : a) + (b > n ? n : b) + (c > n ? n : c));
    }
}