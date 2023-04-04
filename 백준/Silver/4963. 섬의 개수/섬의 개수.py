
from collections import deque

def bfs(i,j):
    queue.append((i,j))
    visited[i][j]=True
    while queue:
        x,y=queue.popleft()
        for k in range(8):
            nx=x+dx[k]
            ny=y+dy[k]
            if 0<=nx<h and 0<=ny<w and visited[nx][ny]==False and mapp[nx][ny]==1:
                visited[nx][ny]=True
                queue.append((nx,ny))


while True:
    w,h=map(int,input().split())
    if w==0 and h==0:
        break
    mapp=[list(map(int,input().split())) for _ in range(h)]
    queue=deque()
    visited=[[False]*w for _ in range(h)]
    cnt=0
    dx=[1,0,-1,0,-1,-1,1,1]
    dy=[0,1,0,-1,-1,1,-1,1]
    for i in range(h):
        for j in range(w):
            if mapp[i][j]==1 and not visited[i][j]:
                bfs(i,j)
                cnt+=1
    print(cnt)
            