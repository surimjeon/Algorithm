# #dfs #깊이 우선탐색, 정점번호 작은 것
def dfs(lst, start): #스택을 사용하는데, lst(=stack)안에 들어있으면서 하나씩 비교할꺼니까 따로 stack에 append할 필요x
    #모두 돌동안->방문체크나 스택을 확인해보는 방법
    visited[start]=True
    print(start, end=' ')
    for i in lst[start]:
        if not visited[i]:
            dfs(lst,i)
#bfs #append 하고 pop함 ->하나하나씩 최적의 방법을 찾음
from collections import deque
def bfs(lst, start):
    queue=deque([start]) #deque를 이용해서 queue에 append
    visited[start]=True
    while queue:
        now=queue.popleft() #왼쪽거를 pop해서
        print(now, end=" ")
        for i in lst[now]:
            if not visited[i]:
                visited[i]=True
                queue.append(i)

#입력값 받기
n,m,v=map(int,input().split()) #노드 개수, 간선개수, 정점번호
lst=[[] for i in range(n+1)] #중요!!!range는 n+1까지 만들기!!! 
for i in range(m):
    start,end =map(int,input().split()) #연결된 노드
    lst[start].append(end) #노드 연결
    lst[end].append(start)

for i in lst:
    i.sort()

visited=[False]*(n+1)
dfs(lst, v)
print()
visited=[False]*(n+1)
bfs(lst,v)