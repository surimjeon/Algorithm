from collections import deque

def tomato(queue):
    dx=[1,0,-1,0]
    dy=[0,-1,0,1]
    while queue:
        a,b=queue.popleft()
        for i in range(4):
            nx=a+dx[i]
            ny=b+dy[i]
            if 0<=nx<n and 0<=ny<m and mapp[nx][ny]==0:
                    queue.append([nx,ny])
                    mapp[nx][ny]=mapp[a][b]+1


m,n=map(int,input().split()) #가로, 세로
mapp=[list(map(int,input().split())) for _ in range(n)]#1:익은거, 0:안익은거 -1:토마토가 없는것

#토마토 시작지점이 2개 이상일 수 있다...

queue=deque()
date=[[0]*m for _ in range(n)]
for i in range(n):
    for j in range(m):
        if mapp[i][j]==1:
            queue.append([i,j])
tomato(queue)

ans=[]
for k in range(n):
    for l in range(m):
        ans.append(mapp[k][l])

if 0 in ans:
    print(-1)
elif max(ans)==1:
    print(0)
else:
    print(max(ans)-1)