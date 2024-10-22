import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 공부 계획의 수
        sc.nextLine();
        int t = Arrays.stream(Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                        .sum(); // 각 계획의 공부 시간
        
        System.out.printf("%d %d", (t + (n-1)*8)/24, (t + (n-1)*8)%24);
    }
}
