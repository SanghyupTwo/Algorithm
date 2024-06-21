import java.util.Scanner;

// 숫자의 개수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // 0 부터 9 까지의 숫자
        int[] num = new int[10];
        String n = a * b * c + "";
        for (char i : n.toCharArray()) {
            num[Character.getNumericValue(i)]++;
        }
        for (int i : num) {
            System.out.println(i);
        }
    }
}
