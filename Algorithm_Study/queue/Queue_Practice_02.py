from Queue import Queue

# josephus 함수 정의
def josephus(n, k):
    # 큐 생성 후 1부터 n까지의 숫자를 큐에 추가
    queue = Queue()
    for i in range(1, n + 1):
        queue.enqueue(i)

    # 마지막 한 명만 남을 때까지 게임을 계속 진행
    while queue.size() > 1:
        # k-1명을 건너뛰기 위해 dequeue와 enqueue를 반복
        for i in range(k - 1):
            queue.enqueue(queue.dequeue())
        # k번째 사람을 큐에서 제거
        queue.dequeue()

    return queue.dequeue()


# 예시 사용법
n, k = map(int, input().split())

print(f"마지막으로 남은 사람의 위치: {josephus(n, k)}")
