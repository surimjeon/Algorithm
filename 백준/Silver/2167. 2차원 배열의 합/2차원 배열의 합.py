import sys
input = sys.stdin.readline

n,m=map(int,input().split())
mapp=[list(map(int,input().split())) for _ in range(n)]
k=int(input())
mapp2=[[0]*(m+1) for _ in range(n+1)]

#누적합 계산
for i in range(1,n+1):
    for j in range(1,m+1):
        mapp2[i][j]=mapp[i-1][j-1]+mapp2[i-1][j]+mapp2[i][j-1]-mapp2[i-1][j-1] #정사각형의 범위로 누적합을 구한다

for _ in range(k):
    i,j,x,y=map(int,input().split())
    ans=mapp2[x][y]-mapp2[i-1][y]-mapp2[x][j-1]+mapp2[i-1][j-1]
    #정사각형 형태로 생각했을 떄, 전체 큰 사각형에서 범위 밖의 사각형들을 빼주고,
    #겹치는 부분을 더해주면 구하려는 값이 나온다.
    print(ans)