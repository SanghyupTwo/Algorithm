n, k = map(int, input().split())
res = [int(str(n*i)[::-1]) for i in range(1, k+1)]

print(max(res))