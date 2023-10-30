n, a, b = map(int, input().split())

print("Bus" if a < b else "Anything" if a >= n and a == b else "Subway")