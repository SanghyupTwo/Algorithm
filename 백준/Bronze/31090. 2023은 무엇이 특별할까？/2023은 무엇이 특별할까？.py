for _ in range(int(input())):
    n = int(input())
    num = n % 100
    print("Good" if (n + 1) % num == 0 else "Bye")
