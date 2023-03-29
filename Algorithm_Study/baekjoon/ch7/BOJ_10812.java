package baekjoon.ch7;

import java.util.Scanner;

// 바구니 순서 바꾸기
public class BOJ_10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int [n+1];
        int[] rotate = new int [n+1];

        for(int i=1; i<arr.length; i++)
            arr[i] = i;

        for(int i=0; i<m; i++) {
            int begin = sc.nextInt(), end = sc.nextInt(), mid = sc.nextInt();
            for(int j=0; j < end - mid +1; j++)
                rotate[begin + j] = arr[mid + j];
            for(int j=0; j<mid-begin; j++)
                rotate[begin + end - mid +1 + j] = arr[begin + j];
            for(int j=begin; j<= end ;j++)
                arr[j] = rotate[j];
        }
        for(int i=1; i<arr.length; i++)
            System.out.print(arr[i] + " ");

        sc.close();
    }
}
