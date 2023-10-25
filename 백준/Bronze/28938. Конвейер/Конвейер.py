_ = input()
res = sum(map(int, input().split()))
print("Stay" if res == 0 else "Right" if res > 0 else "Left")
