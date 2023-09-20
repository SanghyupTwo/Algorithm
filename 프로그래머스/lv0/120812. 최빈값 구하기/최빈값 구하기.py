from collections import Counter

def solution(array):
    # 배열에서 원소의 개수를 카운트
    count = Counter(array)
    
    # 가장 자주 나오는 값의 개수
    max_count = max(count.values())
    
    # 가장 자주 나오는 값들을 모아놓은 리스트
    mode_values = [num for num, freq in count.items() if freq == max_count]
    
    # 최빈값이 여러 개인 경우 -1을 반환, 그렇지 않으면 최빈값 반환
    return -1 if len(mode_values) > 1 else mode_values[0]
