v, s = input(), input()
a, b = s.count('A'), s.count('B')
print('A' if a > b else 'B' if b > a else "Tie")
