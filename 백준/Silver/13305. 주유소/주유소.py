n=int(input())
roads=list(map(int,input().split()))+[0]
price=list(map(int, input().split()))
min_price=price[0]
result=price[0]*roads[0]
for i in range(n-1): #0 1 2
    if price[i] > price[i+1]: #0>1 1>2 2>3
        min_price=price[i+1] 
        result+=roads[i+1]*min_price #12
    else: 
        result+=roads[i+1]*min_price

print(result)
        
