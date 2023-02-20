import sys
from collections import deque

n=int(sys.stdin.readline())
queue=deque()
for i in range(n):
    state=list(sys.stdin.readline().split())
    if state[0]=='push':
        queue.append(state[1])
    elif state[0]=='pop':
        if len(queue)==0:
            print(-1)
        else:
            a=queue.popleft()
            print(a)
    elif state[0]=='size':
        print(len(queue))
    elif state[0]=='empty':
        if queue:
            print(0)
        else:
            print(1)
    elif state[0]=='front':
        if queue:
            print(queue[0])
        else:
            print(-1)
    elif state[0]=='back':
        if queue:
            print(queue[-1])
        else:
            print(-1)
    