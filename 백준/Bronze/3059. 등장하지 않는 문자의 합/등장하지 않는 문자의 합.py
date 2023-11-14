for _ in range(int(input())):
  arr = [0]*26
  s = input()
  res = 0
  for c in s:
    arr[ord(c)-65] += 1
  for i in range(26):
    if arr[i] == 0:
      res += 65+i
  print(res)