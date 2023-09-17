import sys

input = sys.stdin.readline

cnt = 0

for _ in range(int(input())):
  if int(input()) == 1:
    cnt += 1
  else:
    cnt -= 1

print("Junhee is not cute!" if cnt < 0 else "Junhee is cute!")