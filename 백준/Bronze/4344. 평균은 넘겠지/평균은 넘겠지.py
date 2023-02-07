

TC=int(input())

for tc in range(TC):
    lst=list(map(int,input().split()))
    N=lst[0]
    lst=lst[1:]
    mean=sum(lst)/N
    count=0
    for i in range(N):
        if mean<lst[i]:
            count+=1
    result=round(count/N*100,3)
    print(f'{result:.3f}%')
