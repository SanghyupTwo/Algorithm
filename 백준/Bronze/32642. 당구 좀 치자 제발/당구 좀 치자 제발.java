import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        long res = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                cnt += 1;
            } else {
                cnt -= 1;
            }
            res += cnt;
        }
        System.out.println(res);
    }
}