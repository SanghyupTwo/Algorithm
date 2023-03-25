# 더하기 사이클
n = int(input())
cnt = 0
m = n

while m != n or cnt == 0:
    m = (m % 10) * 10 + ((m // 10) + (m % 10)) % 10
    cnt += 1

print(cnt)
