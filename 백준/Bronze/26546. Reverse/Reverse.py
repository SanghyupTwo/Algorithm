for _ in range(int(input())):
    s, i, j = input().split()
    i, j = int(i), int(j)
    print(s[0:i]+s[j::])