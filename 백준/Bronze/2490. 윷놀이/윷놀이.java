import java.util.Scanner;

// 윷놀이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String[] arr = sc.nextLine().split(" ");
            int b = 0;
            int d = 0;
            for (String s : arr) {
                if (s.equals("0")) {
                    b += 1;
                } else {
                    d += 1;
                }
            }
            if (b == 1) {
                System.out.println("A");
            } else if (b == 2) {
                System.out.println("B");
            } else if (b == 3) {
                System.out.println("C");
            } else if (b == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}
