s = ["Never gonna give you up",
     "Never gonna let you down",
     "Never gonna run around and desert you",
     "Never gonna make you cry",
     "Never gonna say goodbye",
     "Never gonna tell a lie and hurt you",
     "Never gonna stop"]

tmp = True

for _ in range(int(input())):
  string = input()
  if string not in s:
    tmp = False
    break
print("No" if tmp else "Yes")