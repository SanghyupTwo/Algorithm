import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (str.equals("save")) {
                cnt = tmp;
                System.out.println(cnt);
            }

            if (str.equals("shoot")) {
                if (tmp > 0) {
                    tmp--;
                }
                System.out.println(tmp);
            }

            if (str.equals("load")) {
                tmp = cnt;
                System.out.println(tmp);
            }

            if (str.equals("ammo")) {
                tmp += k;
                System.out.println(tmp);
            }
        }
    }
}