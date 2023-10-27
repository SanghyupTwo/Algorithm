a = int(input())
b = int(input())
if a % 2 == 0:
  print(a//2 + b//2, a//2 - b//2, sep='\n')
else:
  print(a//2 + 1 + b//2, a//2 - b//2, sep='\n')