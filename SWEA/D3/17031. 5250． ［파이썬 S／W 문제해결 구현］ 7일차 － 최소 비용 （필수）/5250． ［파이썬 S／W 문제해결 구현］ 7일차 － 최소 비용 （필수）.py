'''
다익스트라 알고리즘
1. 각각의 거리를 무한대로 저장
2. 초기 가중치와 시작정점을 저장
3. while문으로 간선의 정보가 최소힙에 계속 있을 때까지
가중치와 시작정점을 꺼내고, pop한 u의 거리가 가중치보다 작으면 계속하고
w가 더작으면 갱신해야되자너
graph에 넣은 v,w정보를 for문으로 받아오고
새로운 w를 dist[u]+가중치로 그 길을 가도록 한다 .
그리고 다시 heapq.heappush하면서 dist에 누적값을 해준다.
'''
import heapq

def search(mapp,x,y):
    dist=[[float('inf')]*n for _ in range(n)] #dist는 방문체크 &값을 표시하는 배열
    pq=[(0,0)]  
    dist[0][0]=0    
    
    while pq:
        x,y = heapq.heappop(pq)
        if x==n-1 and y==n-1:
            print(f'#{tc} {dist[x][y]}')
            break
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<n: #범위안에 있고, 
                diff=0
                if mapp[nx][ny]>mapp[x][y]:
                    diff=mapp[nx][ny]-mapp[x][y] #가중치는 이전값과 이후값의 차이
                #방문하지 않은 곳이면=그 값이 이전값보다 크면, 방문체크 및 값 갱신
                if dist[nx][ny]>dist[x][y]+diff+1: 
                    dist[nx][ny]=dist[x][y]+diff+1
                    heapq.heappush(pq,(nx,ny))#다시 heapq에 넣어주기

T=int(input())

for tc in range(1,T+1):
    n=int(input())
    mapp=[list(map(int,input().split())) for _ in range(n)]
    dx=[0,1,-1,0]
    dy=[1,0,0,-1]
    search(mapp,0,0)