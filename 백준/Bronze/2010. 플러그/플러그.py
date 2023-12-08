import sys
input = sys.stdin.readline

n = int(input())
arr = [int(input()) for _ in range(n)]
print(sum(arr) - (n - 1))
