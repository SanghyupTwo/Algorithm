class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i =0; i<numbers.length; i++){
            result[i] = numbers[i] * 2;
        }
        return result;
    }
}