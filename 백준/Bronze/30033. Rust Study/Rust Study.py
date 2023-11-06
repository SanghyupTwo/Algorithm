n = int(input())
a, b = list(map(int, input().split())), list(map(int, input().split()))

res = [1 for i in range(n) if b[i] >= a[i]]
print(sum(res))
