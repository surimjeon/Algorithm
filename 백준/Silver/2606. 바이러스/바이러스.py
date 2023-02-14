def DFS(com, num):
    stack.append(num)
    while stack:
        now=stack.pop()
        visited.append(now)
        for i in com[now]:
            if i not in visited:
                stack.append(i)
import sys    

node=int(sys.stdin.readline()) #컴퓨터의 수(노드의 수)
line=int(sys.stdin.readline()) #간선의 수

#빈리스트에다가 연결되어있는걸 다 넣어주기()
com=[[] for _ in range(node+1)]

stack=[]
visited=[]

for i in range(line):
    start, end= map(int, input().split())
    com[start].append(end)
    com[end].append(start)

DFS(com, 1)
print(len(set(visited))-1)
