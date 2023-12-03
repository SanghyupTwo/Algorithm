arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
res = 0

for i in range(3):
    if arr2[i] > arr1[i]:
      res += arr2[i]-arr1[i]

print(res)
