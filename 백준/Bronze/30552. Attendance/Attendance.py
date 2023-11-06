arr = []
for _ in range(int(input())):
    s = input()
    if s == "Present!":
        arr.pop()
    else:
        arr.append(s)

print("No Absences" if not arr else '\n'.join(arr))
