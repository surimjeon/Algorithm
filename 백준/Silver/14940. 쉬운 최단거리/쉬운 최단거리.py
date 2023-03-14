#모든 지점에 대해 목표지점까지의 거리 구하기
from collections import deque

#bfs구현코드
def bfs(start_x, start_y):
    quque.append((start_x, start_y))
    visited[start_x][start_y]=True
    ans[start_x][start_y]=0 #자기자신은 

    while quque:
        x,y=quque.popleft()
        for k in range(4):
            nx=x+dx[k]
            ny=y+dy[k]
            if 0<=nx and nx<n and 0<=ny and ny<m and visited[nx][ny]==False:
                if mapp[nx][ny]==1:     #길(1)이 있으면 
                    ans[nx][ny]=ans[x][y]+1  #cnt누적  
                    quque.append((nx,ny))   #queue에 추가
                    visited[nx][ny]=True   #방문체크
                # elif mapp[nx][ny]==0:       #길이 없다면 
                #         ans[nx][ny]=0   #답을 0으로 체크
            
       
n,m=map(int,input().split())

mapp=[]

dx=[1,0,-1,0]
dy=[0,1,0,-1]

quque=deque()
ans=[[-1]*m for _ in range(n)] #안간곳은 -1(도달할 수 없는 위치이면 -1)
visited = [[False]* m for _ in range(n)]

for i in range(n):
    mapp.append(list(map(int,input().split())))
    for j in range(m):
        if mapp[i][j]==2:
            start_x,start_y=i,j

bfs(start_x,start_y) #start부터 모든 점에 대해 돌꺼니까 여기서 for문돌릴 필요가 없다

#ex)mapp에서 0으로 둘러싸여있는 아이들은 -1이니
#mapp=0인 곳에 -1이 나오는 경우 0으로 바꿔주는 처리
for i in range(n):
    for j in range(m):
        if ans[i][j]==-1 and mapp[i][j]==0:
            ans[i][j]=0

for l in ans:
    print(*l)

#목표지점에서부터의 거리+1씩 해줘야함.. 