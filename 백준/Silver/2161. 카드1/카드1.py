

from collections import deque
n=int(input())
lst=[i for i in range(1,n+1)]
queue=deque(lst)
result=[]
imsi=[]

while queue:
    if len(queue)>=2:
        result.append(queue.popleft())
        imsi.append(queue.popleft())
        queue.append(imsi.pop())
    else:
        result.append(queue.pop())

print(*result)
    