import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        int cnt1 = 0;
        for (int i = 0; i < 7; i++) {
            String str2 = sc.next();
            int cnt2 = sc.nextInt();
            if (cnt2 >= cnt1) {
                str1 = str2;
                cnt1 = cnt2;
            }
        }
        System.out.println(str1);
    }
}