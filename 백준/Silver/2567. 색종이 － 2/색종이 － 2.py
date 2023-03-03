n = int(input())
cnt=0
mapp=[[0]*102 for _ in range(102)]

for k in range(n):
    x, y = map(int, input().split())
    for i in range(x+1,x+11):
        for j in range(y+1,y+11):
            if 0<=i<=100 and 0<=j<=100:
                mapp[i][j]=1

for i in range(101):
    for j in range(101):
        if mapp[i][j]^mapp[i+1][j]==1:
            cnt+=1
        if mapp[i][j]^mapp[i][j+1]==1:
            cnt+=1
print(cnt)
