n=int(input())
num=list(map(int,input().split()))

cnt=0
un=[1]*n #연속해서 작아짐=누적해서 쌓을 수 있도록
up=[1]*n

for i in range(1,n):
    if num[i-1]>=num[i]:
        un[i]=un[i-1]+1
    if num[i-1]<=num[i]:
        up[i]=up[i-1]+1

mx=max(max(up),max(un))
print(mx)
