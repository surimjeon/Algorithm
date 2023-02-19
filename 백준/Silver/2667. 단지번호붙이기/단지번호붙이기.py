#총 2개의 변수가 필요 #하나의 재귀에서 돌아가면서 몇번있는지 체크하는 함수와
#재귀가 총 몇번 돌아가는지 체크
import sys
sys.setrecursionlimit(10000)

def dfs(x,y):
    global cnt
    mapp[x][y]=-1
    cnt+=1
    for k in range(4):
        nx=x+dx[k]
        ny=y+dy[k]
        if 0<=nx<n and 0<=ny<n and mapp[nx][ny]==1:
            dfs(nx,ny)
    return cnt
    

n=int(sys.stdin.readline())
mapp=[list(map(int,sys.stdin.readline().rstrip())) for _ in range(n)]
total_cnt=0
count_cnt=[]
dx=[-1,0,1,0] #위,왼,아래,오
dy=[0,-1,0,1]

for i in range(n):
    for j in range(n):
        if mapp[i][j]==1:
            cnt=0
            count_cnt.append(dfs(i,j))
            total_cnt+=1

count_cnt.sort()

print(total_cnt)
for i in count_cnt:
    print(i)