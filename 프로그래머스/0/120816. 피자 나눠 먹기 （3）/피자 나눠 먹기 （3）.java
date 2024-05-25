class Solution {
    public int solution(int slice, int n) {
        // slice 조각 피자
        // n명이 최소 한 조각 이상
        // n%slice가 0이 아니면 +1을 하면 된다?
        if (n%slice==0) {
            return n/slice;
        }else{
            return n/slice+1;
        }
    }
}