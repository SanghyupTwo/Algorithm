for _ in range(int(input())):
  n = list(map(int, input().split()))

  if n[0]*n[1] > n[2]*n[3]:
    print("TelecomParisTech")
  elif n[0]*n[1] < n[2]*n[3]:
    print("Eurecom")
  else:
    print("Tie")