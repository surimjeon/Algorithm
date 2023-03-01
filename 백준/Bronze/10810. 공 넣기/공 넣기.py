n,m=map(int,input().split())
backet=[0 for _ in range(n)]

for i in range(m):
    i,j,k=map(int,input().split())
    for l in range(i-1,j):
        backet[l]=k
print(*backet)