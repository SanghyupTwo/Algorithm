# 주사위 세 개
# soreted()를 이용하면 더 쉽게 풀 수 있다. a==c와 max() 생략 가능
a, b, c = sorted(map(int, input().split()))

if a == b == c:
    print(10000 + a * 1000)
elif a == b or b == c:
    print(1000 + b * 100)
else:
    print(c * 100)