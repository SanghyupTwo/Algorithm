n, m = map(int, input().split())

arr = [[i * m + j + 1 for j in range(m)] for i in range(n)]

# 배열 출력
for row in arr:
    print(*row)
