TC=int(input())

for tc in range(1,TC+1):
    n=int(input())
    mapp=[[0]*r for r in range(1,n+1)]
    
    print(f'#{tc}')
    for i in range(n):
        for j in range(i+1): #이전행에서 사용했던 결과를 이용해서 현재행을 구하기
            if j==0:
                mapp[i][j]=1
            elif i==j:
                mapp[i][j]=1
            else:
                mapp[i][j]=mapp[i-1][j-1]+mapp[i-1][j]
    
        print(*mapp[i])
