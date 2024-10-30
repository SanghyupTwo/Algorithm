import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int d = sc.nextInt();
            int sum = a;
            for (int j = 1; j < n; j++) {
                a += d;
                sum += a;
            }
            System.out.println(sum);
        }
    }
}