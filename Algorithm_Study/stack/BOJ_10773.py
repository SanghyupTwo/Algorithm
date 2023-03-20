# 제로
import sys
input = sys.stdin.readline

# 반복 횟수
k = int(input())
# 스택 선언
stack = []

# 스택의 push, pop
for i in range(k):
    n = int(input())
    stack.pop() if n == 0 else stack.append(n)

# stack의 합을 출력
print(sum(stack))
