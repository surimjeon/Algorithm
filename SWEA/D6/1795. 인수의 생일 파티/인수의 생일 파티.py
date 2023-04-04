import heapq

def dijkstra1(start,end):
    dist=[float('inf') for _ in range(n+1)] #각 노드별 무한히 큰 거리값
    pq=[(0,start)] #힙큐에 start, w
    dist[start]=0
    while pq:
        w,s=heapq.heappop(pq)
        #내가 가진 가중치값이 s보다 크면 건너뛰기
        if s==end:
            return dist[s]
        if dist[s]<w:
            continue
        #아니라면 그래프의 해당노드안에 있는 모든 값에 대해 dist값 갱신해줘야됨
        for v,w in graph[s]:
            new_weight=dist[s]+w #dist s의 값을 가중치를 더해줘야한다. 
            if new_weight<dist[v]: #더해준 가중치 값이 도착노드에 있는 가중치값보다 작으면 그 값을 도착노드의 가중치로!
                dist[v]=new_weight
                heapq.heappush(pq,(dist[v],v)) #끝점과 가중치를 다시 넣음
        

T=int(input())

for tc in range(1,T+1):
    n,m,x=map(int,input().split()) #n개 노드, X를 목표로 함
    graph=[[] for _ in range(n+1)]
    for i in range(m):
        u,v,w=map(int,input().split())
        graph[u].append((v,w))
    
    mx=0
    for i in range(1,n+1):
        a=dijkstra1(i,x) #도착에서 출발로 가는 합
        b=dijkstra1(x,i) #출발에서 도착으로 가는 합
        if a+b>mx:
            mx=a+b
            
    print(f'#{tc} {mx}')