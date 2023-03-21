# 카드2
import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
queue = deque(range(1, n+1)) # range()로 쉽게 값 설정 가능
# queue.extend([i for i in range(1, n + 1)])  # add multiple values to the right end

while len(queue) > 1:
    queue.popleft()
    # pop으로 삭제가 되면 리스트가 당겨진다.
    queue.append(queue.popleft())

print(queue)
