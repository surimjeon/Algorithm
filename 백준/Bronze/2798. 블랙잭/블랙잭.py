n,m=map(int,input().split()) #m:목표 수
card=list(map(int,input().split())) #n장의 카드

ans=[]
for i in range(len(card)):
    for j in range(i+1,len(card)):
        for k in range(j+1,len(card)):
            ans.append(card[i]+card[j]+card[k])

res=sorted(ans,reverse=True)
for i in res:
    if i<=m:
        print(i)
        break
