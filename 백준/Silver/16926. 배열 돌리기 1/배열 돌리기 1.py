import sys
input = sys.stdin.readline
n,m,r=map(int,input().split())
mapp=[list(map(int,input().split())) for _ in range(n)]

for _ in range(r):
    for k in range(min(m,n)//2): #0,1
        #x,y는 돌려지는 배열 중 가장 첫번째 배열 인덱스

        x,y=k,k
        temp=mapp[x][y]

        for j in range(k+1,n-k): #아래
            x=j
            pre=mapp[x][y] #이전값
            mapp[x][y]=temp
            temp=pre #갱신
        for j in range(k+1,m-k): #오
            y=j
            pre=mapp[x][y]
            mapp[x][y]=temp
            temp=pre
        for j in range(k+1,n-k): #위
            x=n-j-1
            pre=mapp[x][y]
            mapp[x][y]=temp
            temp=pre
        for j in range(k+1,m-k):
            y=m-j-1
            pre=mapp[x][y]
            mapp[x][y]=temp
            temp=pre

for i in range(n):
    for j in range(m):
        print(mapp[i][j], end = " ")
    print()