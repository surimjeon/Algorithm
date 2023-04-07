from collections import deque

N, K=map(int, input().split())
yose=deque([i+1 for i in range(N)])
print('<', end='')
while yose:
    for _ in range(K-1):
        yose.append(yose.popleft())
    print(f'{yose.popleft()}', end='')
    if not yose:
        print('>')
        break
    print(', ', end='')