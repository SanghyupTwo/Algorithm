import sys

word = list(map(str, sys.stdin.readline().rstrip("\n")))
res = []

# 반복문을 통해 세 개의 단어로 자른다.
for i in range(1, len(word) - 1):
    for j in range(i + 1, len(word)):
        first = word[:i] # 첫 번째 단어
        second = word[i:j] # 두 번째 단어
        third = word[j:] # 세 번째 단어

        # 각 단어를 뒤집는다.
        first.reverse()
        second.reverse()
        third.reverse()

        # 뒤집은 단어를 원래 순서로 합친 후 리스트에 추가
        res.append("".join(first + second + third))

# 사전 순으로 가장 앞선 단어를 출력하기 위해
# 리스트에서 제일 작은 단어를 출력
print(min(res))
