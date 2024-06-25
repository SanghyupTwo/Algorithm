import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 수
        int K = sc.nextInt(); // 방당 최대 수용 인원

        // 성별/반별 학생 수를 저장하는 배열
        int[][] s = new int[2][7];

        // 학생 수 저장
        for (int i = 0; i < N; ++i) {
            int a = sc.nextInt(); // 성별 (0 또는 1)
            int b = sc.nextInt(); // 반 번호 (1부터 6까지)
            s[a][b]++;
        }

        int ans = 0;

        // 필요한 방의 개수 계산
        for (int i = 0; i < 2; ++i) {
            for (int j = 1; j < 7; ++j) {
                // 배정에 필요한 만큼 방의 개수 추가
                ans += s[i][j] / K;
                // 남는 학생이 있으면 추가 방이 필요
                if (s[i][j] % K != 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
