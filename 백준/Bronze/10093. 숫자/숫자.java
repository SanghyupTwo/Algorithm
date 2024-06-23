import java.util.ArrayList;
import java.util.Scanner;

// 숫자
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        if (a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        ArrayList<Long> list = new ArrayList();
        for (long i = a + 1; i < b; i++) {
            list.add(i);
        }
        System.out.println(list.size());

        for (Long i : list) {
            System.out.print(i + " ");
        }
    }
}
