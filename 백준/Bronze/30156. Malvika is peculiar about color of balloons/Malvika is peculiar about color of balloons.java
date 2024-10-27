import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int cntA = 0;
            int cntB = 0;

            String[] arr = sc.nextLine().split("");

            for (String s : arr) {
                if (s.equals("a")) {
                    cntA++;
                } else {
                    cntB++;
                }
            }
            System.out.println(Math.min(cntA, cntB));

        }

    }
}