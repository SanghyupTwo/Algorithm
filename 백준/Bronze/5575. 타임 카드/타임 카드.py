a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))

res1 = [a[3 + i] - a[i] for i in range(3)]
res2 = [b[3 + i] - b[i] for i in range(3)]
res3 = [c[3 + i] - c[i] for i in range(3)]

for i in range(2, -1, -1):
    if res1[i] < 0:
        res1[i] += 60
        res1[i - 1] -= 1
    if res2[i] < 0:
        res2[i] += 60
        res2[i - 1] -= 1
    if res3[i] < 0:
        res3[i] += 60
        res3[i - 1] -= 1

print(' '.join(map(str, res1)), ' '.join(map(str, res2)), ' '.join(map(str, res3)), sep='\n')
