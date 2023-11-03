speed = int(input()) - int(input())
tmp = abs(speed)
if speed >= 0:
    print("Congratulations, you are within the speed limit!")
else:
    f = 0
    if tmp <= 20:
        f = 100
    elif tmp <= 30:
        f = 270
    else:
        f = 500
    print(f"You are speeding and your fine is ${f}.")