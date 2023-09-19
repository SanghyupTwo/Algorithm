n = int(input())

for i in range(1, n + 1):
    # i의 각 자릿수의 합을 계산하기 위한 초기화
    digit_sum = 0
    
    # i를 문자열로 변환하고, 각 자릿수를 추출하여 합을 계산
    for j in str(i):
        digit_sum += int(j)
    
    # 만약 n과 i의 값과 i의 각 자릿수의 합이 같다면, i를 출력하고 반복을 종료
    if n == i + digit_sum:
        print(i)
        break
else:
    print(0)
