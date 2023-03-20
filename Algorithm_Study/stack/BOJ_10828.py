# 스택
# 시간 초과 발생 -> import sys 사용하니 통과!!
# n = int(input())
# stack = []*n
# for i in range(n):
#     s = input().split()
#     if s[0] == "push":
#         stack.append(s[1])
#     elif s[0] == 'pop':
#         print(stack.pop() if len(stack) != 0 else -1)
#     elif s[0] == 'size':
#         print(len(stack))
#     elif s[0] == 'empty':
#         print(1 if len(stack) == 0 else 0)
#     elif s[0] == 'top':
#         print(stack[len(stack) - 1] if len(stack) != 0 else -1)

import sys

# 빠른 입력을 위해 sys 모듈 사용
input = sys.stdin.readline

stack = []

# 커맨드와 실행 함수를 매핑하는 딕셔너리
command_dict = {'push': stack.append, 'pop': lambda: stack.pop() if stack else -1,
                'size': lambda: len(stack), 'empty': lambda: 0 if stack else 1,
                'top': lambda: stack[-1] if stack else -1}

n = int(input())
for i in range(n):
    command = input().split()
    # 딕셔너리에서 해당 커맨드에 맞는 함수를 찾아 실행함
    result = command_dict[command[0]]()
    print(result)
