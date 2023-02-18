#bfs: 깊이우선탐색
#덱을 활용, ->큐생성하고
# # 기준값을 기준으로 갈 수 있는 방향이 있으면 추가하고, pop하고 그 인접값 탐색해서 또 넣고.....
from collections import deque

def bfs(mapp,x,y):
    queue=deque([(x,y)]) #큐에 데이터 넣기(x,y)로 묶인걸 []안에 넣어야함!!!
    dx=[-1,0,1,0]
    dy=[0,-1,0,1]

    while queue:
        (x,y)=queue.popleft() #튜플형태로 묶어줘야함!!
        for k in range(4):
            nx=x+dx[k]
            ny=y+dy[k]
            if 0<=nx<n and 0<=ny<m and mapp[nx][ny]==1:
                mapp[nx][ny]=mapp[x][y]+1 #이동하는 칸수 더하기
                queue.append([nx,ny])
    return mapp[n-1][m-1]

                
n,m=map(int,input().split()) #행,열
mapp=[list(map(int,input())) for i in range(n)]

a=bfs(mapp,0,0)
print(a)

