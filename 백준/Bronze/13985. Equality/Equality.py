s = input()
a, b, c = map(int, filter(str.isdigit, s))  # 문자열에서 숫자만 추출하여 정수로 변환

if a + b == c:
    print("YES")
else:
    print("NO")
