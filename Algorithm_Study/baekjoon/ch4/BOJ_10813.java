package baekjoon.ch4;

import java.io.*;
import java.util.StringTokenizer;

// 공 바꾸기
public class BOJ_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        // 바구니 개수
        int n = Integer.parseInt(st.nextToken());
        // 바구니 바꾸는 횟수
        int m = Integer.parseInt(st.nextToken());
        // 바구니 배열 생성
        int[] beg = new int[n+1];
        // 처음에는 바구니와 같은 번호가 적힌 공
        for(int i=1; i<beg.length; i++){
            beg[i] = i;
        }
        // 공 바꾸기
        for (int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int z = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
            int tmp = 0;

            tmp = beg[z];
            beg[z] = beg[x];
            beg[x] = tmp;
        }
        for(int b : beg){
            if(b==0) continue;
            bw.write(b+" ");
        }
        br.close();
        bw.flush();
        bw.flush();
    }
}
