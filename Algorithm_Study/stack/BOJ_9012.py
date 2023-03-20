# 괄호
import sys

input = sys.stdin.readline

# 테스터 데이터의 개수
t = int(input())
for i in range(t):
    s = input()
    # 스택 선언
    stack = []
    for j in range(len(s)):
        if s[j] == '(':
            # stack.push()
            stack.append(s[j])
        elif s[j] == ')':
            # stack size가 0이면 NO
            if len(stack) == 0:
                result = 'NO'
                break
            else:
                # stack.pop()
                stack.pop()
        result = 'YES'
    print('YES' if len(stack) == 0 and result != 'NO' else 'NO')

# 함수 생성
# T=int(input())
# def is_vps(my_str):
#     if len(my_str)%2 != 0:
#         print('NO')
#     else:
#         for i in range(25):
#             my_str=my_str.replace('()','')
#         if len(my_str)==0:
#             print('YES')
#         else:
#             print('NO')
#
# for j in range(T):
#     is_vps(input())
