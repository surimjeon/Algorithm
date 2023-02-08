import sys
n=int(sys.stdin.readline())

dot=[]
for _ in range(n):
	x,y=map(int, sys.stdin.readline().split())
	dot.append((x,y))

# dot_lst=list(set(dot))
result=sorted(dot, key=lambda x: (x[1],x[0]))

for i in result:
    print(*i)