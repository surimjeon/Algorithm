from collections import deque
import sys

def bfs(x):
    quque.append(x)
    while quque:
        a=quque.popleft()
        for j in arr[a]:
            if cnt[j]==0:
                quque.append(j)
                cnt[j]=a       ###a는 부모값=>여기다 직접적으로 부모값을 넣어줘야함

N=int(sys.stdin.readline())

arr = [[] for _ in range(N + 1)]
cnt=[0 for _ in range(N + 1)]
for i in range(N-1):
    start,end=map(int,sys.stdin.readline().split())
    #자식을 인덱스로, 부모를 값으로 넣기
    arr[start].append(end)
    arr[end].append(start) #첫번째 연결된 값이 부모의 노드임..

quque=deque()
bfs(1)

for i in range(2,len(cnt)):
    print(cnt[i])
