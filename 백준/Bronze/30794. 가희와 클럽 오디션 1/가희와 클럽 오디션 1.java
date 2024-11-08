import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lv = sc.nextInt();
        String str = sc.next();
        int res = 0;
        if (str.equals("bad")) {
            res = 200 * lv;
        } else if (str.equals("cool")) {
            res = 400 * lv;
        } else if (str.equals("great")) {
            res = 600 * lv;
        } else if (str.equals("perfect")) {
            res = 1000 * lv;
        }
        System.out.println(res);
    }
}