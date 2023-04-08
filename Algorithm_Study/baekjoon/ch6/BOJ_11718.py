# 그대로 출력 하기
s = input()

while s != '':
    try:
        print(s)
        s = input()
    except EOFError:
        break

# 더 간결한 구문
# for line in sys.stdin:
#     line = line.strip()
#     if not line:
#         break
#     print(line)