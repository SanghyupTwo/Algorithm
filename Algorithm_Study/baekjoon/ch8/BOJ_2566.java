package baekjoon.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 최댓값
public class BOJ_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 9×9 격자판
        int[][] arr = new int[9][9];
        // 값 넣어주기
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 최댓값
        int max = 0;
        // 초깃값으로 0을 넣는다면 모든 입력값이 0일때, 틀리게 됨
        int maxI = 1;
        int maxJ = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxI = i + 1;
                    maxJ = j + 1;
                }
            }
        }
        System.out.printf("%d\n %d %d", max, maxI, maxJ);
    }
}
