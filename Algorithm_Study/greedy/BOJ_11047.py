# 동전 0
n, k = map(int, input().split())

coin = [] * n
result = 0

# 동전 입력
for i in range(n):
    coin.append(int(input()))

for i in range(n - 1, -1, -1):
    if k >= coin[i]:
        result += k // coin[i]
        k = k % coin[i]

print(result)
