r, s = int(input()), int(input())
total_cupcakes = r * 8 + s * 3
leftover_cupcakes = total_cupcakes - 28
if leftover_cupcakes < 0:
    leftover_cupcakes = 0
print(leftover_cupcakes)