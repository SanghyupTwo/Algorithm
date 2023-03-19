# 스택을 이용해서 중위표기식을 후위표기식으로 변환하고, 후위표기식을 계산하기
def infix_to_postfix(expression):
    # 연산자 우선순위를 저장하는 사전
    precedence = {'+': 1, '-': 1, '*': 2, '/': 2}
    # 결과를 저장할 리스트와 스택을 초기화
    output = []
    stack = []
    # 표현식의 각 문자에 대해 반복
    for char in expression:
        if char.isnumeric():
            # 피연산자이면 output 리스트에 추가
            output.append(char)
        elif char in precedence:
            # 연산자이면 스택에 추가하고 우선순위가 높은 연산자를 output 리스트에 추가
            while stack and stack[-1] != '(' and precedence[char] <= precedence[stack[-1]]:
                output.append(stack.pop())
            stack.append(char)
        elif char == '(':
            # 왼쪽 괄호는 스택에 추가
            stack.append(char)
        elif char == ')':
            # 오른쪽 괄호가 나올 때까지 스택에서 연산자를 꺼내 output 리스트에 추가
            while stack and stack[-1] != '(':
                output.append(stack.pop())
            # 왼쪽 괄호는 output 리스트에 추가하지 않음
            if stack and stack[-1] == '(':
                stack.pop()
    # 스택에 남아있는 연산자를 output 리스트에 추가
    while stack:
        output.append(stack.pop())
    # output 리스트를 문자열로 반환하여 후위표기식을 만듦
    postfix = ''.join(output)
    return postfix


def evaluate_postfix(expression):
    stack = []
    # 후위표기식의 각 문자에 대해 반복
    for char in expression:
        if char.isnumeric():
            # 피연산자면 스택에 추가
            stack.append(int(char))
        else:
            # 연산자면 스택에서 피연산자를 꺼내 계산한 후 결과를 스택에 추가
            operand2 = stack.pop()
            operand1 = stack.pop()
            if char == '+':
                result = operand1 + operand2
            elif char == '-':
                result = operand1 - operand2
            elif char == '*':
                result = operand1 * operand2
            elif char == '/':
                result = operand1 / operand2
            stack.append(result)
    # 스택에 남아있는 결과가 최종 결과임
    return stack[0]


# 사용 예시
infix_expression = input()
postfix_expression = infix_to_postfix(infix_expression)
print(f"후위표기식: {postfix_expression}")
result = evaluate_postfix(postfix_expression)
print(f"결과: {result}")
