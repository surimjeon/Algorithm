import sys
from collections import deque
n=int(sys.stdin.readline())
lst=[i for i in range(1,n+1)]
queue=deque(lst)
result=[]
imsi=[]

while len(queue)>=2:
    queue.popleft()
    imsi.append(queue.popleft())
    queue.append(imsi.pop())

result=queue.pop()
print(result)
    