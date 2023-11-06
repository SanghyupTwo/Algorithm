h, w = map(int, input().split())
a, b = 0, 0
for _ in range(h):
    tmp = input()
    a += tmp.count('0')
    b += tmp.count('1')

print(min(a, b))
