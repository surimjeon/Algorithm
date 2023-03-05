light=[0]+list(input())
cnt=0
n=len(light)
for i in range(1,n):
    if light==[0]+['N']*(n-1):
        break
    if light[i]=='N': #현재 스위치가 n이면 바꿀 필요없으니 뛰어넘는다..
        continue
    for j in range(i,n,i):
        if light[j]=='Y':
            light[j]='N'
        else:
            light[j]='Y'
    cnt+=1

print(cnt)