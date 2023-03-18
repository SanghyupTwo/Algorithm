# 별 찍기 -2
n = int(input())

i = n - 1
for j in range(1, n + 1):
    print(' ' * i, end='')
    print('*' * j)
    i -= 1

# for j in range(1, n + 1):
    # print('{:>{}}{}'.format('*' * j, n, ''))