a, p = map(int, input().split())
a *= 7
p *= 13
print("Axel" if a > p else "Petra" if p > a else "lika")
