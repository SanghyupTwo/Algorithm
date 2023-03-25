# 코딩은 체육
n = int(input())
s = 'int'
print('long ' * (n // 4 if n % 4 == 0 else n // 4 + 1) + s)
