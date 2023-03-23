# 최소, 최대
n = int(input())
arr = list(map(int, input().split()))

print(min(arr), max(arr))

# 반복문과 조건문 이용해서도 가능

# max = 0
# min = arr[0]
# for i in arr:
#     if i > max:
#         max = i
#     if i < min:
#         min = i
# print(mix, max)
