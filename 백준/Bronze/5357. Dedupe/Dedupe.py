for _ in range(int(input())):
  s = input()
  res = s[0]
  for i in range(1, len(s)):
    if s[i] != s[i-1]:
      res += s[i]
  print(res)
