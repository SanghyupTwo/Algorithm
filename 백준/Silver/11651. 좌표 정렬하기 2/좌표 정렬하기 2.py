import sys
input = sys.stdin.readline

n = int(input())
# key 매개변수를 사용하여 정렬 키를 지정
point = sorted([list(map(int, input().split())) for _ in range(n)], key=lambda x : (x[1], x[0]))

[print(' '.join(map(str, point[i]))) for i in range(n)]