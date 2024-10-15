import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 몇 번 반복 되는지
        int n = sc.nextInt();
        // n개의 난이도 중에서 홀수 찾기?
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            if (d%2!=0) cnt += 1;
        }
        System.out.println(cnt);
    }
}