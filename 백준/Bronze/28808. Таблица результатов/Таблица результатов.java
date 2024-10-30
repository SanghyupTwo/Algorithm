import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split("");
            for (int j = 0; j < m; j++) {
                if (str[j].equals("+")) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}