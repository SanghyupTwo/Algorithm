a = list(map(int, input().split()))
b = list(map(int, input().split()))

score1 = a[0]*3 + a[1]*20 + a[2]*120
score2 = b[0]*3 + b[1]*20 + b[2]*120

print("Draw"if score1 == score2 else "Max" if score1 > score2 else "Mel")