import sys
sys.setrecursionlimit(10000)

def search(lst,x,y):
    dx=[-1,0,1,0] #위,왼,아래,오
    dy=[0,-1,0,1]

    for k in range(4): #시작점을 정해줬으니, 전체 행렬을 다 돌필요가 없다
        nx=x+dx[k]
        ny=y+dy[k]
        if 0<=nx<n and 0<=ny<m:
            if lst[nx][ny]==1: #4방탐색했을 떄 1도 없으면 거기까지..?
                lst[nx][ny]=-1 #visited을 안쓰고 이렇게 값을 주는 이유: 함수바깥의 for문에서 탐색할때 1이면 다시 탐색할거기때문에 값을 바꿔줌
                search(lst,nx,ny)


TC=int(input())

for tc in range(TC):
    m,n,k=map(int,input().split()) #가로, 세로, 배추의 개수
    lst= [[0]*m for _ in range(n)]
    for _ in range(k):
        x,y=map(int,input().split()) #배추 x,y위치
        lst[y][x]=1

    cnt=0
    for i in range(n):
        for j in range(m):
            if lst[i][j]==1:
                search(lst,i,j) #탐색하면서 인접한 것이 있으면 -1로 바꿔주는 함수
                cnt+=1
    print(cnt)
    


