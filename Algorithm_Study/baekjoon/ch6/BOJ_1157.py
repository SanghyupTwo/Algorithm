# 단어 공부
s = input().upper()

# 문자열 중복 제거하기
lst = [x for x in s]

maxNum = 0
ch = ''

# 문자열 알파벳 개수 세기
for x in set(lst):
    if maxNum == s.count(x):
        ch = '?'
    elif s.count(x) > maxNum:
        maxNum = s.count(x)
        ch = x

print(ch)
