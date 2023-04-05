'''
바이러스는 상하좌우빈칸으로 모두 퍼져나갈 수 있다 
새로 세울수있는 벽은 3개
바이러스가 퍼질 수 없는 안전영역이 최대가되는 값은?
2근처에 벽을 놓고 다 하나씩 돈다. ->최대값ㅇ르 구한다
1. 벽을 만든다.
2. 바이러스가 퍼진걸 체크한다. 
'''
import sys
from collections import deque
import copy
def make_wall(block): #벽만들기(DFS..)
    if block==3: #벽을 다 세웠다면
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if mapp[i][j]==0:
                mapp[i][j]=1
                make_wall(block+1) #벽을 하나씩 세워보자
                mapp[i][j]=0 #그리고 다시 초기화
    

def bfs():
    queue=deque()
    test_mapp=copy.deepcopy(mapp)
    for i in range(n):
        for j in range(m):
            if test_mapp[i][j]==2:
                queue.append((i,j))

    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<m and test_mapp[nx][ny]==0:
                test_mapp[nx][ny]=2
                queue.append((nx,ny))
    
    global result
    cnt=0
    for i in range(n):
        for k in range(m):
            if test_mapp[i][k] == 0:
                cnt +=1
    result=max(cnt,result)
    
n,m=map(int,sys.stdin.readline().split()) #세로, 가로
mapp=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]
dx=[-1,0,1,0]
dy=[0,-1,0,1]
result=0
make_wall(0)
print(result)