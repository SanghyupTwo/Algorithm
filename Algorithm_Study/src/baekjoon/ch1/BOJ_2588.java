package baekjoon.ch1;

import java.util.Scanner;

// 곱셈
public class BOJ_2588 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 % 100) / 10));
        System.out.println(num1 * (num2 / 100));
        System.out.println(num1 * num2);
    }
}
