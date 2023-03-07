n,k=map(int,input().split())

lst=[]
i=1
while i<=n:
    if n%i==0:
        lst.append(i)
    i+=1

if len(lst)<k:
    print(0)
else:
    print(lst[k-1])