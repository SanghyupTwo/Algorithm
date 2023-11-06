res = 0

for _ in range(int(input())):
    m = list(map(int, input().split()))
    if m[0] == 136:
        res += 1000
    elif m[0] == 142:
        res += 5000
    elif m[0] == 148:
        res += 10000
    else:
        res += 50000

print(res)
