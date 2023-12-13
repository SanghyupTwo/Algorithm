arr = [True, False, False]
for _ in range(int(input())):
    a,b = map(int, input().split())
    if arr[a-1] or arr[b-1]:
        if arr[a-1]:
            arr[b-1] = True
            arr[a-1] = False
        else:
            arr[a-1] = True
            arr[b-1] = False

for i in range(1, 4):
    if arr[i-1]:
        print(i)