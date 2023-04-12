# 설탕 배달
n = int(input())
# arr = [5, 3]
result = 0

while n > 0:
    if n % 5 == 0 or n % 5 == 3:
        result += 1
        n -= 5
    elif n % 3 == 0:
        result += 1
        n -= 3
    elif n-3 % 5 != 0 and n % 3 != 0:
        result = -1
        break

print(result)
