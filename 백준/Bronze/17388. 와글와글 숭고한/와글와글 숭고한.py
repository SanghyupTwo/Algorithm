s, k, h = map(int, input().split())
# 참여도가 가장 낮은 대학
bad = min(s, min(k, h))

if s + k + h >= 100:
    print("OK")
elif bad == s:
    print("Soongsil")
elif bad == k:
    print("Korea")
else:
    print("Hanyang")
