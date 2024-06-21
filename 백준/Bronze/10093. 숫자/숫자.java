import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 숫자
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        ArrayList<Integer> list = new ArrayList();
        for (int i = a + 1; i < b; i++) {
            list.add(i);
        }
        System.out.println(list.size());

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
