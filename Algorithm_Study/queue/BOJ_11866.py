# 요세푸스 문제 0
import sys
from collections import deque

input = sys.stdin.readline

n, k = map(int, input().split())
q = deque(range(1, n + 1))
result = []

while len(q) != 0:
    for i in range(k - 1):
        q.append(q.popleft())
    result.append(q.popleft())
print(f'<{", ".join(map(str, result))}>')

# 더욱더 간단하게 풀기
# q.rotate(-(k - 1))  # rotate deque by k-1 positions
# result.append(q.popleft())
