def search(i,j):
    dx=[-1,0,1,0]
    dy=[0,1,0,-1]
    hap=mapp[i][j]
    for k in range(4):
        for l in range(1,mapp[i][j]+1):
            nx=i+dx[k]*l
            ny=j+dy[k]*l
            if 0<=nx<n and 0<=ny<m:
                hap+=mapp[nx][ny]
    return hap

T=int(input())
for tc in range(1,T+1):
    n,m=map(int,input().split())
    mapp=[list(map(int,input().split())) for _ in range(n)]
    mx=0
    for i in range(n):
        for j in range(m):
            if mx<search(i,j):
                mx=search(i,j)
    print(f'#{tc} {mx}')