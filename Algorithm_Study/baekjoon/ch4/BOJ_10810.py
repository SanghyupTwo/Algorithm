# 공 넣기
n, m = map(int, input().split())
arr = [0] * (n + 1)

for f in range(m):
    i, j, k = map(int, input().split())
    for g in range(i, j + 1):
        arr[g] = k

print(*arr[1:])
