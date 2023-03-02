T=int(input())

for tc in range(1,T+1):
    lst=list(map(int,input().split()))
    t=lst[0]
    lst=lst[1:]
    seat=[]
    cnt=0
    for i in range(20):
        if i==0 or max(seat)<lst[i]:
            seat.append(lst[i])
        else:
            seat.append(lst[i])
            for j in range(len(seat)):
                if seat[j]>seat[i]:
                    seat[j],seat[i]=seat[i],seat[j]
                    cnt+=1
    print(tc, cnt)