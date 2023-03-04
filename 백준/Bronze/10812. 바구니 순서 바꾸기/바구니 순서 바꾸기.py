n,m=map(int,input().split())
backet=[i for i in range(1, n+1)]

for _ in range(m):
    i,j,k=map(int,input().split())
    backet=backet[:i-1]+backet[k-1:j]+backet[i-1:k-1]+backet[j:]
print(*backet)
