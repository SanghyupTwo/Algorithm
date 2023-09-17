import sys

# 표준 입력에서 문자열 읽기
s = sys.stdin.read()

# 알파벳 빈도를 저장할 리스트 초기화
arr = [0] * 26

# 입력 문자열을 반복하며 알파벳 빈도 계산
for c in s:
    if c.islower():  # 영문 소문자인 경우에만 처리
        arr[ord(c) - ord('a')] += 1

# 가장 많이 나타나는 알파벳 찾기
maxx = max(arr)

for i in range(26):
    if arr[i] == maxx:                      
        print(chr(97 + i), end='')
