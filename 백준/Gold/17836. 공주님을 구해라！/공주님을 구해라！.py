'''
T시간 내로 도달해야함.. 
그람을 잡으면 벽을 부수고 공간으로 갈 수 있음
0공간, 1벽, 2 그람
(1,1)용사, 공주는 (n,m)

case1 : 벽 피해서 갔을 때
그람 구해서 갈떄 그 그람부터 마지막 공주까지의 x,y의 거리
최단 거리: bfs
'''
from collections import deque

#공주님까지 가는거리
def princess(start_i,start_j): #검이 있는 곳까지... end...
    global t 
    queue.append((start_i,start_j,0)) #x,y
    visited=[[False]*m for _ in range(n)]
    visited[start_i][start_j]=True #방문체크
    while queue:
        x,y,cnt=queue.popleft() #queue에 값들 뺴기
        if x==n-1 and y==m-1: 
            return cnt
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<m and mapp[nx][ny]!=1 and visited[nx][ny]==False:
                queue.append((nx,ny,cnt+1))
                visited[nx][ny]=True
    return t+1

#칼까지 가는 거리
def gram(start_i,start_j):
    global t
    queue.append((start_i, start_j, 0))
    visited=[[False]*m for _ in range(n)]
    visited[start_i][start_j]=True
    
    for i in range(n):
        for j in range(m):
            if mapp[i][j]==2:
                end_x=i
                end_y=j
    while queue:
        x,y,cnt=queue.popleft()
        if x==end_x and y==end_y: #검을 만나면 return
            return cnt + (m-end_y-1)+(n-end_x-1)
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<m and visited[nx][ny]==False and mapp[nx][ny]!=1:
                queue.append((nx,ny,cnt+1))
                visited[nx][ny]=True
    return t+1

n,m,t=map(int,input().split())
mapp=[list(map(int,input().split())) for _ in range(n)]

dx=[1,0,-1,0]
dy=[0,-1,0,1]
queue=deque()

ans1=princess(0,0) #거리 반환
ans2=gram(0,0)

ans=min(ans1,ans2)

if ans<=t:
    print(ans)
else:
    print('Fail')