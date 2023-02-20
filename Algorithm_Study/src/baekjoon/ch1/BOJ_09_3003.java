package baekjoon.ch1;

import java.util.Scanner;

public class BOJ_09_3003 {
    // 킹, 퀸, 룩, 비숍, 나이트, 폰
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();   // 1
        int queen = sc.nextInt();  // 1
        int rook = sc.nextInt();   // 2
        int bishop = sc.nextInt(); // 2
        int knight = sc.nextInt(); // 2
        int pawn = sc.nextInt();   // 8

        System.out.printf("%d %d %d %d %d %d",
                (king == 1 ? 0 : (king < 1 ? 1 : 1 - king)),
                (queen == 1 ? 0 : (queen < 1 ? 1 : 1 - queen)),
                (rook == 2 ? 0 : (rook < 2 ? 2 - rook : 2 - rook)),
                (bishop == 2 ? 0 : (bishop < 2 ? 2 - bishop : 2 - bishop)),
                (knight == 2 ? 0 : (knight < 2 ? 2 - knight : 2 - knight)),
                (pawn == 8 ? 0 : (pawn < 8 ? 8 - pawn : 8 - pawn))
        );
    }
}
