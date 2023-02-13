package ch2;

import java.util.Scanner;

public class BOJ_05_2884 {
    // 알람 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt() - 45;
        sc.close();

        if (m < 0) {
            m += 60;
            h--;
            if (h < 0) {
                h = 23;
            }
        }
        System.out.println(h + " " + m);
    }
}
