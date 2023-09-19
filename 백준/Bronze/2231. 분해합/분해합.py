n = int(input())

# 가능한 범위를 계산
min_value = max(1, n - 90)  # 90을 기준으로 범위를 좁힘
max_value = n

found_number = 0  # 조건을 만족하는 숫자를 저장할 변수

# 가능한 범위 내의 각 숫자에 대해 조건을 확인
for num in range(min_value, max_value + 1):
    # 각 자릿수를 뺀 값을 계산
    digit_sum = num + sum(map(int, str(num)))
    
    # 조건을 만족하는 경우, 해당 숫자를 저장하고 반복 종료
    if digit_sum == n:
        found_number = num
        break

# 조건을 만족하는 숫자가 없다면 0을 출력, 그렇지 않으면 해당 숫자 출력
print(found_number)