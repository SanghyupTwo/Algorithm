for _ in range(int(input())):
  s = input()
  res = s[0]
  for i in range(len(s)):
    if i == 0:
      continue
    if s[i] == s[i-1]:
      continue
    else:
      res += s[i]
  print(res)