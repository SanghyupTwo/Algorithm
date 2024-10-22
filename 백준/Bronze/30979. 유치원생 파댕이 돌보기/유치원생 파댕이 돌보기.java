import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 파댕이를 돌봐야 하는 시간
        int n = sc.nextInt(); // 가지고 있는 사탕의 총 개수
        sc.nextLine();
        int[] f = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); // f맛은 f분 동안 울음을 멈춘다.
        int sum = 0;

        for (int i : f) {
            sum += i;
        }

        System.out.println(sum >= t ? "Padaeng_i Happy" : "Padaeng_i Cry");
    }
}
