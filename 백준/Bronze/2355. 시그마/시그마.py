a,b = map(int,input().split())
if a>b:
    a,b=b,a
# 가우스의 공식을 활용
print(b*(b+1)//2-a*(a-1)//2)
