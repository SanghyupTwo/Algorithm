x, y  = map(int, input().split())
print(x+y if x > y else 0 if x==y else y-x)