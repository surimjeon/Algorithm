import sys
n=int(sys.stdin.readline())

k=[]

k.append(1)
k.append(3)

for i in range(2,n+1):
    k.append((k[i-2]*2)+k[i-1])

print(k[n-1]%10007)

