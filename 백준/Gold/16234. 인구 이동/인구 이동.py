from collections import deque
n,l,r=map(int,input().split())
mapp=[list(map(int,input().split())) for _ in range(n)]
dx=[-1,0,1,0]
dy=[0,1,0,-1]

def bfs(x,y):
    q=deque()
    temp = []
    q.append((x,y))
    temp.append((x,y))
    visited[x][y]=1

    while q:
        i,j=q.popleft()
        for k in range(4):
            nx = i+dx[k]
            ny = j+dy[k]
            if 0<=nx<n and 0<=ny<n and visited[nx][ny]==0:
                if l<=abs(mapp[i][j]-mapp[nx][ny])<=r:
                    visited[nx][ny]=1
                    q.append((nx,ny))
                    temp.append((nx,ny))
    return temp

#인구이동이 며칠동안 발생하는지 알아야지
# 인구이동할 때까지 돌고
ans=0
while True:
    visited=[[0]*n for i in range(n)]
    flag=0 #다 돌았는데, 인구이동이 있었는지 없었는지 체크할 용도   
    
    for i in range(n):
        for j in range(n):
            if visited[i][j]==0:
                country=bfs(i,j) #연결되어있는 나라의 인덱스들
                
                if len(country)>1: #원래 나라도 추가하기 때문(연결된 나라가 있으면)
                    flag=1 #인구이동이 있었음
                    num=sum([mapp[x][y] for x,y in country])// len(country)
                    for x,y in country:
                        mapp[x][y]=num

    if flag==0:
        break
    ans+=1
print(ans)