a,b=map(int,input().split())

mn=min(a,b)
mx=max(a,b)
cnt=0
lst=[]
if mn==mx:
    print(cnt)
    print()
else:
    for i in range(mn+1,mx):
        cnt+=1
        lst.append(i)
    print(cnt)
    print(*lst)