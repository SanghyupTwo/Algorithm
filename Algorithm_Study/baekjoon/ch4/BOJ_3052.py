# 나머지
import sys

input = sys.stdin.readline

lst = []
for i in range(10):
    lst.append(int(input()) % 42)
lst = set(lst)

print(len(lst))
# 한줄로 가능
# print(len(set([int(input()) % 42 for i in range(10)])))
