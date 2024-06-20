import java.util.Arrays;
import java.util.Scanner;

// 세수정렬
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
