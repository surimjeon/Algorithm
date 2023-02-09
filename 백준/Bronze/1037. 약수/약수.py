import sys

cnt=int(sys.stdin.readline())
number=sorted(list(map(int, sys.stdin.readline().split())))

result=number[0]*number[-1]
print(result)

