T=int(input())

for tc in range(1,T+1):
    n,m=map(int,input().split())

    mapp=[list(input()) for _ in range(n)]

    #3개의 영역으로 구분하기
    minv=2500 #n*m의 최댓값
    for a in range(n-2): #w영역 맨 아래 0~N-3:w영역이 될 수 있는 값의 범위
        for b in range(a+1,n-1): #B영역 맨 아래 i+2 #b영역이 될 수 있는 값의 범위
            cnt=0 #각 영역에서 새로 칠하는 횟수
    #각 영역을 돌기
            for i in range(a+1):
                for j in range(m): #모두 탐색해야하니까
                    if mapp[i][j]!='W':
                        cnt+=1
            for i in range(a+1,b+1): #중간 영역
                for j in range(m):
                    if mapp[i][j]!='B':
                        cnt+=1
            for i in range(b+1,n): #마지막 영역
                for j in range(m):
                    if mapp[i][j]!='R':
                        cnt+=1
            if minv>cnt:
                minv=cnt
    print(f'#{tc} {minv}')