from itertools import combinations

n, m = map(int, input().split())
arr = list(map(int, input().split()))
res = 0

for a, b, c in combinations(arr, 3):
    if a + b + c > m:
        continue
    res = max(res, a + b + c)
print(res)
