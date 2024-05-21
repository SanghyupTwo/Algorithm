class Solution {
    public int solution(int[] array) {
        // 0부터 1000까지의 빈도를 저장할 배열 생성
        int[] numbers = new int[1001];
        
        // 배열의 각 요소에 대해 빈도를 계산
        for (int a : array) {
            numbers[a]++;
        }
        
        // 최빈값을 찾기 위한 변수들
        int maxFrequency = 0;
        int mode = -1;
        boolean isMultipleMode = false;
        
        // 빈도수를 바탕으로 최빈값 결정
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxFrequency) {
                maxFrequency = numbers[i];
                mode = i;
                isMultipleMode = false; // 새로운 최빈값이 발견되었으므로 false로 설정
            } else if (numbers[i] == maxFrequency && numbers[i] > 0) {
                isMultipleMode = true; // 동일한 빈도의 값이 또 있다면 최빈값이 여러 개임
            }
        }
        
        // 최빈값이 여러 개인 경우 -1 반환
        if (isMultipleMode) {
            return -1;
        }
        
        // 최빈값 반환
        return mode;
    }
}