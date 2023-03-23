# X보다 작은 수
n, x = map(int, input().split())
arr = map(int, input().split())
for i in arr:
    if i < x:
        print(i, end=" ")

# print(*[i for i in arr if i<x])