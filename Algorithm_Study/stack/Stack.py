class Stack:
    def __init__(self):
        self.items = []  # 데이터 저장을 위한 리스트 준비

    def push(self, val):
        self.items.append(val)

    def pop(self):
        try:
            return self.items.pop()  # pop할 아이템이 없으면
        except IndexError:
            print("Stack is empty")  # indexError 발생

    def top(self):
        try:
            return self.items[-1]
        except IndexError:
            print("Stack is empty")

    def __len__(self):  # len()로 호출하면 stack의 item 수 반환
        return len(self.items)
