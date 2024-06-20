import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력함수 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력함수
		StringTokenizer st;
 
		int n=Integer.parseInt(br.readLine()); // 한번에 읽어들여 정수로 변환하는 과정
     
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine()," "); // 띄어쓰기를 기준으로 값들을 나눔
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+ "\n"); //출력
		}
		
		br.close();
		bw.flush();
		bw.close();

	}
}
