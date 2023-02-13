n,m=map(int,input().split())

result=[[0]*m for i in range(n)]

a=[list(map(int,input().split())) for i in range(n)]
b=[list(map(int,input().split())) for i in range(n)]

for i in range(n): #2,1,0
	for j in range(m): #
		result[i][j]=a[i][j]+b[i][j]

for k in range(n):
	print(*result[k])
