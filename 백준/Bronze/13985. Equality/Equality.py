s = input()
a, b, c = 0, 0, 0

for i in s:
  if a and b and i.isdigit():
    c = int(i)
  elif a and i.isdigit():
    b = int(i)
  elif i.isdigit():
    a = int(i)

if a + b == c:
  print("YES")
else:
  print("NO")