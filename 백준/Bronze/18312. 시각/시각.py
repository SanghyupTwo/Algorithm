n, k = map(int, input().split())
k = str(k)
cnt = 0

for h in range(n + 1):
  for m in range(60):
    for s in range(60):
      # 0을 찾는 경우에는 2355에서 0을 찾을 수 있다
      time_str = f'{h:02d}{m:02d}{s:02d}'
      if k in time_str:
        cnt += 1

print(cnt)
