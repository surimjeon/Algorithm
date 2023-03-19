from itertools import combinations

n, m =map(int,input().split()) #회원의 수 n, 치킨 종류의 수 m
lst=[list(map(int,input().split())) for _ in range(n)] #각 줄에 치킨 선호도 명시

mx=0 #각 경우의 수의 max값을 저장할 변수 
for a,b,c in combinations(range(m), 3): #3가지 조합 변수
    sm=0 #한줄씩 최대값들을 담을 변수
    for x in range(n):
        sm+=max(lst[x][a], lst[x][b], lst[x][c]) #각 행에서 최대의 값을 뽑기
    mx=max(sm, mx) #모든 합 중 가장 큰 합

print(mx)
        