
TC=int(input())
for tc in range(1,TC+1):
    n=int(input())
    lst=[input().split() for _ in range(n)]
    lst_t=list(map(list,zip(*lst)))
    a1=[[0]*n for _ in range(n)]
    a2=[[0]*n for _ in range(n)]
    a3=[[0]*n for _ in range(n)]


# #2번방법: 회전각도에 따른 위치값을 저장함(3줄)
    for i in range(n):
        for j in range(n):
            a1[i][j]=lst[n-1-j][i] #90도
            a2[i][j]=lst[n-1-i][n-1-j] #180도
            a3[i][j]=lst[j][n-1-i] #270도
    
    print(f'#{tc}')
    for a,b,c in zip(a1,a2,a3):
        print(f'{"".join(a)} {"".join(b)} {"".join(c)}')
