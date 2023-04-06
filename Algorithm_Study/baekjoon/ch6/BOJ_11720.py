# 숫자의 합
n, sum = int(input()), 0
num = input()

for i in range(n):
    sum += int(num[i])

# sum = sum(int(x) for x in num)

print(sum)