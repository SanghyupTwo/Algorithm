n = int(input())

# 1~11까지의 출력값 리스트
output_values = [(12, 1600), (11, 894), (11, 1327), (10, 1311),
                 (9, 1004), (9, 1178), (9, 1357), (8, 837),
                 (7, 1055), (6, 556), (6, 773)]

# 숫자와 출력값 매핑 딕셔너리
output_dict = dict(zip(range(1, 12), output_values))

# 출력
print(*output_dict[n])
