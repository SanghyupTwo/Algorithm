import java.util.Arrays;
import java.util.Scanner;

// X보다 작은 수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        sc.nextLine();
        
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : arr) {
            if (i < x) {
                System.out.print(i + " ");
            }
        }
    }
}
