from Queue import Queue

# 큐 객체 셍성
q = Queue()

# 큐에 아이템 추가
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)

# 큐의 크기 출력
print('Queue size:', q.size())

# 큐에서 아이템 삭제
print('삭제', q.dequeue())
print('삭제', q.dequeue())
print('삭제', q.dequeue())

# 큐가 비었는지 확인
print('비어있는가? :', q.is_empty())
