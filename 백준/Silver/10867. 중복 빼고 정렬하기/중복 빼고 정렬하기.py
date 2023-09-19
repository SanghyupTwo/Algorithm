n = input()
# set으로 중복 제거
print(*sorted(set(list(map(int, input().split())))))
