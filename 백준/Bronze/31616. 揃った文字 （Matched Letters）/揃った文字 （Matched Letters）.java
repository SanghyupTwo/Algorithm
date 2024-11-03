import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        boolean res = true;
        for (char c : s.toCharArray()) {
            if (c != s.charAt(0)) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "Yes" : "No");
    }
}