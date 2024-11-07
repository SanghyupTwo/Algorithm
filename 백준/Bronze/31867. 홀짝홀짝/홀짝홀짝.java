import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String k = sc.nextLine();
        int oddCnt = 0;
        int evenCnt = 0;

        for (char c : k.toCharArray()) {
            if (Integer.parseInt(c+"") % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        System.out.println(evenCnt > oddCnt ? 0 : evenCnt < oddCnt ? 1 : -1);
    }
}