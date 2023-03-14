#모든 지점에 대해 목표지점까지의 거리 구하기
from collections import deque
def bfs(start_x, start_y):
    quque.append((start_x, start_y))
    visited[start_x][start_y]=True
    ans[start_x][start_y]=0
    while quque:
        x,y=quque.popleft()
        
        for k in range(4):
            nx=x+dx[k]
            ny=y+dy[k]
            if 0<=nx and nx<n and 0<=ny and ny<m and visited[nx][ny]==False:
                if mapp[nx][ny]==1:
                    ans[nx][ny]=ans[x][y]+1            
                    quque.append((nx,ny))
                    visited[nx][ny]=True
                elif mapp[nx][ny]==0:
                        ans[nx][ny]=0
            
       
n,m=map(int,input().split())

mapp=[]

dx=[1,0,-1,0]
dy=[0,1,0,-1]

quque=deque()
ans=[[-1]*m for _ in range(n)] #안간곳은 -1 
visited = [[False]* m for _ in range(n)]

for i in range(n):
    mapp.append(list(map(int,input().split())))
    for j in range(m):
        if mapp[i][j]==2:
            start_x,start_y=i,j

bfs(start_x,start_y)

for i in range(n):
    for j in range(m):
        if ans[i][j]==-1 and mapp[i][j]==0:
            ans[i][j]=0

for l in ans:
    print(*l)

#목표지점에서부터의 거리+1씩 해줘야함.. 