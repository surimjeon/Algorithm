from collections import deque

def bfs(start,visited, computers):
    queue=deque()
    queue.append(start)
    visited[start]=True
    while queue:
        x=queue.popleft()
        for i in range(len(computers)):
            if computers[x][i]==1 and not visited[i]:
                visited[i]=True
                queue.append(i)


def solution(n, computers): #컴퓨터개수, 연결행렬
    answer=0
    visited=[False]*(n+1)
    for i in range(n):
        for j in range(n):
            if visited[i]==False and computers[i][j]==1:
                bfs(i, visited, computers)
                answer+=1
            
    return answer