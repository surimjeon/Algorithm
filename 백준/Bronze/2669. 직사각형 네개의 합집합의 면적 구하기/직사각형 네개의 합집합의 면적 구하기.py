#매트리스 100*100만들기

blank=[[0]*101 for i in range(101)]

count=0

for i in range(4):
    x1,y1,x2,y2=map(int,input().split())
    for x in range(x1, x2):
        for y in range(y1,y2):
            blank[x][y]=1

for x in range(1,101):
    for y in range(1,101):
        if blank[x][y]==1:
            count+=1

print(count)