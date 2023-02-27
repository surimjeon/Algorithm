T=int(input())

for tc in range(1,T+1):
    n=int(input())
    mapp=[list(map(int,input())) for _ in range(n)]

    #가운데점
    cen=n//2 #5*5
    lst=[]
    for i in range(n):
        for j in range(n):
            if abs(cen-i)+abs(cen-j)<=n//2:
                lst.append(mapp[i][j])

    print(f'#{tc} {sum(lst)}')