import sys

s = sys.stdin.read()
w1 = s.replace('K','0').replace('P','1').replace('N','3').replace('B','3').replace('R','5').replace('Q','9')
b1 = s.replace('k','0').replace('p','1').replace('n','3').replace('b','3').replace('r','5').replace('q','9')

w2 = 0
b2 = 0

for i in w1:
    if i.isdigit():
        w2 += int(i)

for i in b1:
    if i.isdigit():
        b2 += int(i)

print(w2-b2)