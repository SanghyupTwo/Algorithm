import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int lastComputer = (int) Math.pow(a % 10, b % 4 == 0 ? 4 : b % 4) % 10;
            // 0일 때는 10번 컴퓨터가 처리
            if (lastComputer == 0) lastComputer = 10;
            System.out.println(lastComputer);
        }
    }
}