n,k=map(int,input().split())
circle=[i for i in range(1,n+1)]

res=[]
point=0
while circle:
    point=(point+(k-1))%len(circle) 
    a=circle.pop(point)
    res.append(a)

print('<', end='')
for i in range(n-1):
    print(res[i], end=', ')
print(res[-1], end='')
print('>')