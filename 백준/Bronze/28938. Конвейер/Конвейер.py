n = input()
res = sum(map(int, input().split()))

if res == 0:
    print("Stay")
elif res > 0:
  print("Right")
else:
  print("Left")