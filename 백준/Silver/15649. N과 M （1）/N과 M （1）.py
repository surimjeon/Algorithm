def johap(arr, n): # 배열과, n:개수
    result = []
    if n==0:
        return [[]]
    for i in range(len(arr)):
        elem=arr[i]
        for rest in johap(arr[:i]+arr[i+1:],n-1):
            result.append([elem]+rest)
    return result

n,m=map(int,input().split())
arr=[i for i in range(1,n+1)]


for i in johap(arr,m):
    ans=i
    print(*i)