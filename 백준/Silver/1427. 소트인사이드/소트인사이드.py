n=list(map(int,[i for i in input()]))

n.sort(reverse=True)

for i in n:
    print(i, end='')
