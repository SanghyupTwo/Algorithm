n = input()
a = map(int, input().split())
res = 0

for i in a:
  if i % 2 != 0:
    res -= 1
  else:
    res += 1

if res > 0:
  print("Happy")
else:
  print("Sad")