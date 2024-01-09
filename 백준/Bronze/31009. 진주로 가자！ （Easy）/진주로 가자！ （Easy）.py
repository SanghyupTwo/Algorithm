n = int(input())
b = []*n

res = 0

for i in range(n):
    s, n = input().split()
    b.append(int(n))
    if s == "jinju":
        res = b[i]

print(res, sum(1 for i in b if i > res), sep='\n')