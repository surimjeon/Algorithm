import sys 
n=int(sys.stdin.readline())
lst=list(map(int,sys.stdin.readline().split()))

result=[]
for i in range(n):
	if lst[i] not in result:
		result.append(lst[i])
	else:
		continue

result.sort()

print(*result)