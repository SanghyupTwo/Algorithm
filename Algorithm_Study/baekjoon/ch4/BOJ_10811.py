# 바구니 뒤집기
import sys

input = sys.stdin.readline

# n, m = map(int, input().split())
# beg = [i for i in range(1, n + 1)]
#
# for _ in range(m):
#     i, j = map(int, input().split())
#     역순으로 만들기
    # beg[i - 1: j] = beg[i - 1: j][::-1]
#
# print(*beg)

answer = "1234"
lst = [int(answer[i]) for i in range(len(answer))]
if ((len(answer) == 4 or len(answer)) == 6) and lst:
    print(1)
else:
    print(2)