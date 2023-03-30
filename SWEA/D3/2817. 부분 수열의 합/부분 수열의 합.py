def subset1(i):
    global cnt
    if i==n: 
        hap=0
        for i in range(n):
            if check[i]==1: #부분집합에 포함되면 
                hap+=lst[i] #합을 구한다
        if hap==k: #합이 k와 같으면 +1씩 
            cnt+=1
        return
    
    check[i]=0 #리스트의 자리값이 0일 때(그 요소가 부분집합에 포함x)
    subset1(i+1)
    check[i]=1 #리스트의 자리값이 1일 떄(그 요소가 부분집합에 포함)
    subset1(i+1)



T=int(input())

for tc in range(1,T+1):
    n,k=map(int,input().split())
    lst=list(map(int,input().split()))
    check=[0]*n
    cnt=0
    subset1(0)
    print(f'#{tc} {cnt}')