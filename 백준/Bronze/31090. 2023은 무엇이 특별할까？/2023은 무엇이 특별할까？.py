for _ in range(int(input())):
    n = int(input())
    num = int(str(n)[2::])
    print("Good" if (n+1) % num == 0 else "Bye")
