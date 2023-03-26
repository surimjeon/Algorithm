'''
단절점(cut vertex) : 해당 정점을 제거하였을 때, 그 정점이 포함된 그래프가 2개 이상으로 나뉘는 경우
단절선(bridge) : 해당 간선을 제거하였을 때, 그 간선이 포함된 그래프가 2개 이상으로 나뉘는 경우
트리그래프에 대한 이해가 완벽하면 쉽게 풀 수 있는 문제..
단절점의 경우, 끝에 있는 노드(즉, 연결이 1개만 되어있는 노드)는 연결을 끊어도 2개이상으로 나눠지지 않는다.
단절선의 경우, 선이기 때문에 끊어버리면, 노드2개가 된다. -> 그래서 단절선의 경우 무조건 yes이다. 

'''

import sys
n=int(sys.stdin.readline())
lst=[[] for _ in range(n+1)]
for i in range(n-1):
    start,end=map(int,sys.stdin.readline().split())
    lst[start].append(end) #연결노드
    lst[end].append(start)

m=int(input())
for j in range(m):
    t,k=map(int,sys.stdin.readline().split())
    if t==1:
        if (len(lst[k])<2):
            print('no')
        else:
            print('yes')
    elif t==2:
        print('yes')