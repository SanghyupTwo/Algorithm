import sys

for _ in range(int(input())):
  s = sys.stdin.readline().rstrip()
  print("yes" if len(s)>=6 and len(s)<=9 else "no")
  