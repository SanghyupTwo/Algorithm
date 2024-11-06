import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (cnt == 3) {
                break;
            }
            if (c == 'o') {
                cnt += 1;
            } else {
                cnt = 0;
            }
        }
        System.out.println(cnt==3 ? "Yes" : "No");
    }
}