
from itertools import combinations

n,m=map(int,input().split()) #m:치킨집 개수
mapp=[list(map(int,input().split())) for _ in range(n)]
ans=999999
house=[]
chicken=[]

for i in range(n):
    for j in range(n):
        if mapp[i][j] == 1:
            house.append((i,j))
        elif mapp[i][j] == 2:
            chicken.append((i,j))

#1개부터 m개까지 조합을 구하기

for c in combinations(chicken,m):
    total_d=0
    for r1, c1 in house:
        d=99999
        for r2, c2 in c : #치킨집 선택 조합의 튜플 묶음
            d=min(d,abs(r1-r2)+abs(c1-c2)) #각 치킨집 간의 거리 중에 가장 최소값을 찾기
        total_d+=d                   #도시의 모든 치킨거리의 합
    ans=min(total_d, ans) # 모든조합에서 가장 최소인값 = 정답
print(ans)
