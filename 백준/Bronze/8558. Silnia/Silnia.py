n = int(input())
res = 1

for i in range(1, n+1):
  res *= i

print(str(res)[-1])
