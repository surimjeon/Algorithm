n,m=map(int,input().split())
lst=list(i for i in range(1,n+1))

for k in range(m):
    i,j=map(int,input().split()) #1,2
    lst=lst[:i-1]+lst[i-1:j][::-1]+lst[j:]

print(*lst)