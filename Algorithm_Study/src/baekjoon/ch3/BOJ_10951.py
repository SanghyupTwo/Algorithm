# A+B -4
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    if a == '' or b == '':
        break;
    print(a + b)

# import sys

# for line in sys.stdin:
#     try:
#         a, b = map(int, line.split())
#         print(a + b)
#     except ValueError:
#         break