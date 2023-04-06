# 알파벳 찾기
S = input()

# 알파벳 위치를 저장할 리스트 초기화
arr = [-1] * 26

for i, ch in enumerate(S):
    # 해당 알파벳이 처음 등장하는 위치를 저장
    if arr[ord(ch) - 97] == -1:
        arr[ord(ch) - 97] = i

# 알파벳 위치 출력
print(*arr)
