d, p = 0, 0

for _ in range(int(input())):
    s = input()
    if s == 'D':
        d += 1
    else:
        p += 1

    if abs(d - p) >= 2:
        print(f"{d}:{p}")
        break
else:
    print(f"{d}:{p}")
