ans=[1,1,2,2,2,8]
mapp=list(map(int,input().split()))
res=[]

for i in range(6):
    res.append(ans[i]-mapp[i])
print(*res)