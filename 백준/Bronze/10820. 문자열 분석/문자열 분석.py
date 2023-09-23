import sys

input = sys.stdin.readline

while True:
  arr = [0]*4
  s = input()
  if s == '':
    break
  for c in s:
    if 'a' <= c <= 'z':
      arr[0] += 1
    elif 'A' <= c <= 'Z':
      arr[1] += 1
    elif '0' <= c <= '9':
      arr[2] += 1
    elif c == ' ':
      arr[3] += 1        
  print(*arr)