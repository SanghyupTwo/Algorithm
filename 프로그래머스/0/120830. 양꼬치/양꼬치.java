class Solution {
    public int solution(int n, int k) {
        // 10인분 -> 음료 하나 서비스
        // 양꼬치 1인분 12000, 음료수 2000
        return n*12000 + (k-n/10)*2000;
    }
}