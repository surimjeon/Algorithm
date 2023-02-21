
from collections import deque

def bfs(start):
    queue.append(start)
    while queue:
        a=queue.popleft()
        for i in adj[a]:
            if people[i]==0:#방문체크해주기
                queue.append(i)
                people[i]=people[a]+1



for tc in range(1,11):
    n, first=map(int,input().split()) #데이터 길이, 시작점
    lst=list(map(int,input().split()))
    adj=[[] for i in range(101)] #인덱스값과 연결하는 값들을 같이 저장한다
    frm=[]
    to=[]
    for i in range(n//2):
        frm.append(lst[i*2])
        to.append(lst[i*2+1])
    for frm,to in zip(frm,to):
        adj[frm].append(to)
    people=[0]*101
    result_idx=[]
    queue = deque()
    bfs(first)
    for idx,val in enumerate(people):
        if val==max(people):
            result_idx.append(idx)
    print(f'#{tc} {max(result_idx)}')