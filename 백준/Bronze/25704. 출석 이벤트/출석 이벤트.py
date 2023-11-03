n, p = int(input()), int(input())
res = []

if n >= 20:
    res.append(p - int(p * 0.25))
if n >= 15:
    res.append(p - 2000)
if n >= 10:
    res.append(p - int(p * 0.1))
if n >= 5:
    res.append(p - 500)

# res가 비었을 때 min() 함수 사용하면 ValueError
print(p if not res else 0 if min(res) < 0 else min(res))
