socks = []
for _ in range(5):
  s = int(input())
  if s in socks:
    socks.remove(s)
  else:
    socks.append(s)

print(socks[0])
    