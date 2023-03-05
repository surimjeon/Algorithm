def check():
    dx=[1,1,0,1]
    dy=[-1,1,1,0]
    for i in range(n):
        for j in range(n):
            if mapp[i][j]=='o':
                for k in range(4):
                    cnt=1
                    for l in range(1,5):
                        nx=i+dx[k]*l
                        ny=j+dy[k]*l
                        if 0<=nx<n and 0<=ny<n:
                            if mapp[nx][ny]=='o':
                                cnt+=1
                    if cnt>=5:
                        return 'YES'
    return 'NO'

T=int(input())

for tc in range(1,T+1):
    n=int(input())
    mapp=[list(input()) for _ in range(n)]
    ans=check()
    print(f'#{tc} {ans}')

