import sys

input = sys.stdin.readline

for _ in range(3):
  n = int(input())
  num = [int(input()) for _ in range(n)]
  a = sum(num)
  if a == 0:
    print(0)
  elif a > 0:
    print('+')
  elif a < 0:
    print('-')