# 영수증
x = int(input())
n = int(input())
total = 0

for i in range(n):
    a, b = map(int, input().split())
    total += (a * b)

print('Yes' if x == total else "No")
