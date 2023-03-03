#m*m의 합이 가장 클 때 죽은 파리의 개수는?
T=int(input())

for tc in range(1,T+1):
    n,m=map(int,input().split())
    mapp=[list(map(int,input().split())) for _ in range(n)]
    mx=0
    for i in range(n-m+1):  #범위 잘주기..->range(n-m)하면 n이 m으로 나눠떨어지지 않을 떄 범위가 잘못주어진다..! 조심!! 
        for j in range(n-m+1):
            sum=0
            for k in range(i,i+m):
                for l in range(j,j+m):
                    sum+=mapp[k][l]
            if sum>mx:
                mx=sum
    print(f'#{tc} {mx}')
 #3,4,7,8 틀림..