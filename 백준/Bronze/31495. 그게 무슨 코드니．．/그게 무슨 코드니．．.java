import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // 최소 길이 2 이상이어야 처리 진행
        if (s.length() >= 2 && s.charAt(0) == '\"' && s.charAt(s.length() - 1) == '\"') {
            String str = s.substring(1, s.length() - 1).trim();
            System.out.println(str.isEmpty() ? "CE" : str);
        } else {
            System.out.println("CE");
        }
    }
}