import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 소들의 수
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt(); // 배정된 공간
        
        int res = (w / l) * (h / l);
        
        System.out.println(res > n ? n : res);
    }
}