T=int(input())

for tc in range(1,T+1):
    n,k=map(int,input().split()) #n개 숫자, k번쨰 큰 수
    lst=list(input())
    lsts=[]
    for i in range(n//4): #4자리씩 결합한 문자 구하기
        for j in range(0,n,n//4):
            a=int(''.join(lst[j:j+n//4]),16)
            if a not in lsts:
                lsts.append(a)
        lst=[lst[-1]]+lst[:-1]
    lsts.sort(reverse=True)
    print(f'#{tc} {lsts[k-1]}')