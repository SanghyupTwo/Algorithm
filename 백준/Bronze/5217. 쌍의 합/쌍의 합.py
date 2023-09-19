import sys

input = sys.stdin.readline

for _ in range(int(input())):
  n = int(input())
  arr = [[i, n-i] for i in range(1, n+1) if i <n-i]
  pairs_str = ', '.join([f"{x} {y}" for x, y in arr])
  print(f"Pairs for {n}: {pairs_str}")