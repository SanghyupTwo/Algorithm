class Solution {
    public int[] solution(int number1, int denom1, int number2, int denom2) {
        int number = number1 * denom2 + number2 * denom1;
        int denom = denom1 * denom2;
        int gcd = gcd(number, denom); // Math 클래스를 사용하지 않고 직접 gcd 메서드 호출
        return new int[]{number/gcd, denom/gcd};
    }
    
    // 최대공약수를 계산하는 메서드
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
