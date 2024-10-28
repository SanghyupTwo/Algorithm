import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            System.out.println(2 * x - 1);
        }
    }
}