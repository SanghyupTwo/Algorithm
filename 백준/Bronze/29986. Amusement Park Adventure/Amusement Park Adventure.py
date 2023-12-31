n, h = map(int, input().split())
arr = list(map(int, input().split()))
res = 0

for i in arr:
    if h >= i:
        res += 1
        
print(res)