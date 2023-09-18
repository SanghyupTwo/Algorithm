import sys

for _ in range(int(input())):
    s = sys.stdin.readline().rstrip()
    print("yes" if 6 <= len(s) <= 9 else "no")
