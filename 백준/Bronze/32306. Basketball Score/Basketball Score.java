import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] team1 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] team2 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 3; i++) {
            sum1 += team1[i] * 10 * (i+1);
            sum2 += team2[i] * 10 * (i+1);
        }
        System.out.println(sum1>sum2?1: sum1 < sum2 ? 2 : 0);
    }
}