import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// X보다 작은 수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> res = new ArrayList<>();
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : arr) {
            if (x > i) {
                res.add(i);
            }
        }
        for (Integer r : res) {
            System.out.print(r+" ");
        }
    }
}
