for _ in range(3):
    h1, m1, s1, h2, m2, s2 = map(int, input().split())
    t1 = h1 * 60 * 60 + m1 * 60 + s1
    t2 = h2 * 60 * 60 + m2 * 60 + s2
    res = t2 - t1

    h = res // 60 // 60 % 24
    m = res // 60 % 60
    s = res % 60

    print(h, m, s)
