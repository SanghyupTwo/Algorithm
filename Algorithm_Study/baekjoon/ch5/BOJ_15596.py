# 정수 N개의 합
def solve(a):
    ans = 0
    # ans = sum(a)
    for i in a:
        ans += i
    return ans

# 출력
print(solve([1, 2, 3]))
