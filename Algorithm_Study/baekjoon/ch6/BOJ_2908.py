# 상수
a, b = input().split()

a, b = int(a[::-1]), int(b[::-1])

print(max(a, b))
# print(a if a > b else b)
