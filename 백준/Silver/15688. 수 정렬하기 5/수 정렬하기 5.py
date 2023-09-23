import sys

input = sys.stdin.readline

n = int(input())
num = sorted([int(input()) for _ in range(n)])

[print(i) for i in num]
