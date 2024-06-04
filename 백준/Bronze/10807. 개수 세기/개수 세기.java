import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int v = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i < Integer.parseInt(n); i++) {
            if (Integer.parseInt(arr[i]) == v) cnt++;
        }
        
        System.out.println(cnt);
    }
}