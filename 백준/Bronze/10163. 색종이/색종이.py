import sys

n=int(sys.stdin.readline())

mapp=[[0]*1001 for _ in range(1001)]

for k in range(1,n+1):
    x,y,w,h=list(map(int,sys.stdin.readline().split()))
    for i in range(x,x+w): #123
        for j in range(y,y+h): #4,5
            mapp[i][j]=k
    
for i in range(1,n+1):
    cnt=0
    for m in mapp: #파이썬 한줄에서 해당 숫자가 얼마만큼있는지 세기
        cnt+=m.count(i)
    print(cnt)


