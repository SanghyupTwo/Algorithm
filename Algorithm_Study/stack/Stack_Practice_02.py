# 스택을 이용 해서 문자열 반전
s = input()
stack = []
# 삽입
for i in range(len(s)):
    stack.append(s[i])
# 삭제
for i in range(len(s)):
    print(stack.pop(), end="")

# 슬라이스 표기법을 사용해서 숫자 뒤집기
num = 1234
print(int(str(num)[::-1]))
