import sys
sys.setrecursionlimit(10000000)

def dfs(x,y):
    global width
    mapp[x][y]=0
    width+=1
    dx=[0,-1,0,1]
    dy=[-1,0,1,0]
    for k in range(4):
        nx=x+dx[k]
        ny=y+dy[k]
        if 0<=ny<m and 0<=nx<n and mapp[nx][ny]==1:
            dfs(nx,ny)
    
#그림의 개수와 가장 큰 넓이 출력하기
n,m=map(int,sys.stdin.readline().split()) #x,y
mapp=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]
mx_width=[]
for i in range(n):
    for j in range(m):
        if mapp[i][j]==1:
            width=0
            dfs(i,j)
            mx_width.append(width)
if len(mx_width)==0:
    print(len(mx_width))
    print(0)
else:
    print(len(mx_width))
    print(max(mx_width))
