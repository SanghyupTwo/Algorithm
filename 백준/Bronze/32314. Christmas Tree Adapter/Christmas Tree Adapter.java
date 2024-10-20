import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 크리스마스 트리의 암페어

        int w = sc.nextInt(); // 후보 어뎁터의 와트
        int v = sc.nextInt(); // 후보 어뎁터의 전압

        // 와트 = 암페어*볼트 -> 암페어 = 와트/볼트
        System.out.println((w / v) >= a ? "1" : "0");
    }
}