s, a, b = int(input()), int(input()), int(input())
res = 250

while s > a:
    a += b
    res += 100

print(res)
