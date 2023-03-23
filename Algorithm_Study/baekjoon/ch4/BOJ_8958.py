# OX퀴즈
import sys

input = sys.stdin.readline
n = int(input())

for i in range(n):
    s = input()
    cnt, result = 0, 0
    for j in range(len(s)):
        # cnt = cnt+1 if s[j]=='O' else 0
        if s[j] == 'O':
            cnt += 1
            result += cnt
        else:
            cnt = 0
    print(result)
