# 과제 안 내신 분...?
arr = [0] * 30
print(arr)
for i in range(1, 29):
    n = int(input())
    arr[n - 1] = 1

for i in range(len(arr)):
    if arr[i] == 0:
        print(i + 1)
