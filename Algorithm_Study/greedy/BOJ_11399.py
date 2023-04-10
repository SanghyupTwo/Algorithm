# ATM
n = int(input())
p = sorted(map(int, input().split()))

running_sum = 0
result = 0

# 시간 복잡도 O(n^2)
for i in range(1, n + 1):
    for j in range(i):
        result += p[j]

# 시간 복잡도 O(n)
for i in range(1, n + 1):
    result += sum(p[:i])

# time complexity O(n)
for i in range(n):
    running_sum += p[i]
    result += running_sum

print(result)
