# 한수
n = int(input())
# 99보다 작은 수는 무조건 한수!
cnt = min(n, 99) # cnt 변수를 n과 99의 최소값으로 초기화

for i in range(100, n + 1):
    a, b, c = i // 100, (i // 10) % 10, i % 10 # 백의 자리, 십의 자리, 일의 자리로 나누기
    if a - b == b - c:
        cnt += 1

print(cnt)
