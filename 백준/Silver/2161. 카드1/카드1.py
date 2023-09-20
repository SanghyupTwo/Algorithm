from collections import deque

n = int(input())
q = deque(range(1, n+1))

while q:
    print(q.popleft(), end=' ')
    if q:
        q.append(q.popleft())
