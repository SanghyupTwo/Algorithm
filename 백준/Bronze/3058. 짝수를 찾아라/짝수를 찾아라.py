for _ in range(int(input())):
    arr = list(map(int, input().split()))
    res = [i for i in arr if i % 2 == 0]
    print(sum(res), min(res))
