package baekjoon.ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 공 넣기
public class BOJ_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] beg = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int z = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            for (int j = z; j <= x; j++) {
                beg[j] = y;
            }
        }
        for (int i = 1; i < beg.length; i++) {
            System.out.print(beg[i] + " ");
        }
        br.close();
    }
}
