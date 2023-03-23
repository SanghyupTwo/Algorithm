# 최댓값
arr = []
for i in range(9):
    arr.append(int(input()))
print(max(arr), arr.index(max(arr))+1, sep='\n')
