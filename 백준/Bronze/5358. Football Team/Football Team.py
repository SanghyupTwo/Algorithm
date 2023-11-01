while True:
  try:
      s = input()
      if s == '':
          break
      s = s.replace('i', '#').replace('e', 'i').replace('#', 'e').replace('I', '@').replace('E', 'I').replace('@', 'E')
      print(s)
  except EOFError:
      break
