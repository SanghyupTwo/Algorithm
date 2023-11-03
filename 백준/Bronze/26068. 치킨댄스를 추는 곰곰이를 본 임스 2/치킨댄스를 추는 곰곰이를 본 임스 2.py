cnt = 0

for _ in range(int(input())):
    s = input()
    s = s.replace('D-','')
    if int(s) <= 90:
        cnt += 1

print(cnt)