d, h, m = map(int, input().split())

# 시작 시간과 종료 시간을 분으로 변환
start_time = 11 * 24 * 60 + 11 * 60 + 11  # 시작 시간을 분으로 변환
end_time = d * 24 * 60 + h * 60 + m  # 종료 시간을 분으로 변환
total_time = end_time - start_time  # 총 시간 차이를 계산

# 결과 출력
if total_time >= 0:
    print(total_time)
else:
    print(-1)
