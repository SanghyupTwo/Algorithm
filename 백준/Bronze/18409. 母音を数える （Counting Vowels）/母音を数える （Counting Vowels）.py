import sys

input = sys.stdin.readline

n, s = input(), input().rstrip()

# 모음 문자열
vowels = 'aiueo'

# print(sum([1 for c in s if c == 'a' or c == 'i' or c == 'u' or c == 'e' or c == 'o']))

# 모음 문자열에서 각 모음 문자가 문자열 s에서 몇 번 나타나는지를 세고, 그 합을 출력
print(sum([s.count(c) for c in vowels]))
