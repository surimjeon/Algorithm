'''
치킨을 dfs, 백트래킹으로 푸는 경우
'''

from collections import deque
N,M = map(int, input().split())                                # 도시 크기, 최대 치킨집 수
mapp = [list(map(int, input().split())) for _ in range(N)]

def dfs(n,i): #n: 고른 치킨집의 수, i: 치킨집 번호(한번씩 돌아가면서 )
    global result
    val = 0
    # 모든 치킨집을 골랐다면 치킨거리 계산
    if n == M:
        for h in house:
            hr, hc = h[0], h[1]
            dist = 2*N

            for c in select:
                cr, cc = c[0], c[1]
                tmp = abs(hr-cr) + abs(hc-cc)
                if tmp < dist:
                    dist = tmp  #각 집의 치킨거리 계산
            val += dist #도시전체의 치킨거리를 추가하면서

        if val < result: #최소 도시전체의 치킨거리 계산하고 return
            result = min(val, result)
            return 
    
    for idx in range(i,k): #치킨집 번호부터 총 치킨집 개수까지 넣어보면서 dfs추가해보기
        select.append(chicken[idx]) #치킨집을 하나씩 넣어보고
        dfs(n+1, idx+1) 			#치킨집 개수와 치킨집번호를 +1씩 증가하기
        select.pop()				#다시 원상복귀


house= deque([])
chicken=deque([])
select = deque([])


for i in range(N):
    for j in range(N):
        if mapp[i][j]==1:
            house.append((i,j))
        elif mapp[i][j]==2:
            chicken.append((i,j))

k =len(chicken) #치킨집의 총 개수
result = 999999
#조합 시작
for idx in range(k): #chicken 큐에 들어있는, 치킨집 번호
    dfs(0,idx)
print(result)