class Solution {
    public int solution(int n) {
        // 피자는 6조각
        // 나눠 먹을 사람은 n 명
        // n 명이 같은 수의 피자 조각
        int pizza = 6;
        int cnt = 1;
        while (true){
            if (pizza%n==0) return cnt;
            cnt++;
            pizza += 6;
        }
    }
}