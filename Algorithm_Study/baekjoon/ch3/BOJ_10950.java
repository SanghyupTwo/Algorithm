package baekjoon.ch3;

import java.util.Scanner;

// A+B -3
public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }
        sc.close();
    }
}
