import sys

input = sys.stdin.readline

# 알파벳 출현 횟수를 저장하는 배열 초기화
c = [0] * 26
res = ''

for _ in range(int(input())):
    s = input().rstrip()
    
    # 이름의 첫 글자에 해당하는 알파벳의 출현 횟수 증가
    c[ord(s[0]) - ord('a')] += 1

# 알파벳 출현 횟수를 검사하여 5번 이상 출현한 알파벳을 res에 추가
for i in range(len(c)):
    if c[i] >= 5:
        res += chr(ord('a') + i)

print(res if res else "PREDAJA")
