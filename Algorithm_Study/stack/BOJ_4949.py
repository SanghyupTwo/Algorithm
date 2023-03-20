# 균형잡힌 세상
import sys

while True:
    s = sys.stdin.readline().rstrip()
    if s == '.':
        break
    stk = []
    temp = True
    for i in s:
        if i == '(' or i == '[':
            stk.append(i)
        elif i == ')':
            if not stk or stk[-1] == '[':
                temp = False
                break
            elif stk[-1] == '(':
                stk.pop()
        elif i == ']':
            if not stk or stk[-1] == '(':
                temp = False
                break
            elif stk[-1] == '[':
                stk.pop()
    # print('yes' if temp==True and not stk else 'no')
    if temp == True and not stk:
        print('yes')
    else:
        print('no')
