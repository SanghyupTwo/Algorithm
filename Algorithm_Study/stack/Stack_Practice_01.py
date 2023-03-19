# 스택을 이용 해서 괄호 맞추기
def is_balanced_parentheses(s):
    stack = []
    for c in s:
        if c == '(':
            # 스택에 여는 괄호 삽입
            stack.append(c)
        elif c == ')':
            # 1.스택이 비어 있다는 것은 앞에 여는 괄호가 없다는 뜻
            # 2.스택의 맨 위 요소가 여는 괄호가 아니면 만난 닫는 괄호가 열리지 않는다는 의미
            if len(stack) == 0 or stack.pop() != '(':
                return False
    return len(stack) == 0


# 입력 값의 괄호가 맞는지 확인
print(is_balanced_parentheses(input()))
