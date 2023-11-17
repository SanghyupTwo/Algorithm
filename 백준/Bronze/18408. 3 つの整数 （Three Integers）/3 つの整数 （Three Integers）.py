arr = list(map(int, input().split()))

print(1 if arr.count(1)>arr.count(2) else 2)