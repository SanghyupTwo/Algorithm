n, h = map(int, input().split())
arr = list(map(int, input().split()))
print(sum(1 for i in arr if h >= i))