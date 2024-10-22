import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int R = sc.nextInt(); // 좌석의 세로 크기
        int C = sc.nextInt(); // 좌석의 가로 크기
        int N = sc.nextInt(); // CCTV가 커버할 수 있는 영역

        // 필요한 CCTV의 개수 계산 (올림 처리)
        long rows = (R + N - 1) / N; // 세로 방향 CCTV 수
        long cols = (C + N - 1) / N; // 가로 방향 CCTV 수

        // 최소 CCTV 개수 출력
        System.out.println(rows * cols);
    }
}