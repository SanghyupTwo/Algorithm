import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 원래 고기 온도
        int a = sc.nextInt();
        // 목표 온도
        int b = sc.nextInt();
        // 얼어 있는 고기를 1도 데우는데 걸리는 시간
        int c = sc.nextInt();
        // 얼어 있는 고기를 해동 하는데 걸리는 시간
        int d = sc.nextInt();
        // 얼어 있지 않는 고기를 1도 데우는데 걸리는 시간
        int e = sc.nextInt();

        int res = 0;

        // 원래 고기가 얼어 있을 때 -> -a * c 초
        // 고기 해동 -> d
        // 고기 데우기 -> b * e

        if (a < 0) {
            res = (-a * c) + d + (b * e);
        } else {
            res = (b - a) * e;
        }
        System.out.println(res);
    }
}