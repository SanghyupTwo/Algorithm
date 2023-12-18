s = input()
res = s[0]
for c in s:
    if res[-1] != c:
        res += c

print(res)