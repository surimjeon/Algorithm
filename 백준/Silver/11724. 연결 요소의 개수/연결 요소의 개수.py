'''
이문제의 팁! 연결된 구역이 몇개인지 =다른 시작점에서 함수를 몇번 호출할건지
=cnt변수로 함수를 호출한 횟수를 작성
->visited 변수를 줘서 방문한 곳들을 체크하면서 이동하고
dfs에서 나오면(연결된 요소들을 다 체크하고 나면) cnt+1
그리고 방문하지 않은 요소들을 탐색함
'''
import sys
sys.setrecursionlimit(10000)


def dfs(start):
    visited[start]=True #방문표시하기
    for i in lst[start]: 
        if not visited[i]: #해당 인덱스의 요소들에 방문한 적이 없다면 
            dfs(i)     #다시 탐색하기

n,m=map(int,sys.stdin.readline().split())
lst=[[] for _ in range(n+1)]
for i in range(m):
    u,v=map(int,sys.stdin.readline().split()) #시작점과 끝점을 받아서
    lst[u].append(v)       #서로연결시켜줌(여기서! 양방향이 아닌 단방향인 이유: 문제에서 방향없는 그래프라고 주어졌기 떄문)
    lst[v].append(u)
visited=[False]*(n+1)       #변수설정
cnt=0

for j in range(1, n+1):
    if not visited[j]: #방문하지 않은 요소들을 탐색한다
        dfs(j)
        cnt+=1         #dfs함수를 방문하면 cnt+1
print(cnt)