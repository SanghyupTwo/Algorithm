while True:
    t = int(input())
    if t == 0:
        break
    arr = [int(input()) for _ in range(t)]
    arr.reverse()
    print('\n'.join(map(str, arr)))
    print(0)