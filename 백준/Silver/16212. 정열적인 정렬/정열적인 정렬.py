import sys

input = sys.stdin.readline

n = input()
num = sorted(list(map(int, input().split())))
print(*num)