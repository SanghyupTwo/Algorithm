# 문자열 반복
t = int(input())

for i in range(t):
    r, s = input().split()
    # 첫 번째 문자열 부터 반복
    for x in s:
        print(x * int(r), end="")
    print()
