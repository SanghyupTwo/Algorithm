# 다이얼
s = input()
time = 0

for x in s:
    if x == 'A' or x == 'B' or x == 'C':
        time += 3
    elif x == 'D' or x == 'E' or x == 'F':
        time += 4
    elif x == 'H' or x == 'I' or x == 'G':
        time += 5
    elif x == 'J' or x == 'K' or x == 'L':
        time += 6
    elif x == 'O' or x == 'N' or x == 'M':
        time += 7
    elif x == 'P' or x == 'Q' or x == 'R' or x == 'S':
        time += 8
    elif x == 'T' or x == 'U' or x == 'V':
        time += 9
    else:
        time += 10

print(time)

# 사전을 사용하면 더 쉽게 가능
# dial_map = {
#     'A': 3, 'B': 3, 'C': 3,
#     'D': 4, 'E': 4, 'F': 4,
#     'G': 5, 'H': 5, 'I': 5,
#     'J': 6, 'K': 6, 'L': 6,
#     'M': 7, 'N': 7, 'O': 7,
#     'P': 8, 'Q': 8, 'R': 8, 'S': 8,
#     'T': 9, 'U': 9, 'V': 9,
#     'W': 10, 'X': 10, 'Y': 10, 'Z': 10
# }
