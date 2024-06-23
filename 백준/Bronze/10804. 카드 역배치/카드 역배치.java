import java.util.Scanner;

// 카드 역배치
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        // 1, 2, 3, ..., 19, 20
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            // a가 더 크면 재배치
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            // 순서 바꾸기
            for (int j = a - 1; j < b; j++) {
                int tmp = num[j];
                num[j] = num[--b];
                num[b] = tmp;
            }
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
