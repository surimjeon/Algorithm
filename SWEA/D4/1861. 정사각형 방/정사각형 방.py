from collections import deque

def dfs(x,y,cnt):
    global max_len
    deq=deque()
    dx=[0,1,0,-1]
    dy=[1,0,-1,0]
    deq.append((x, y, cnt))
    visitied[x][y] = 1
    while deq:
        x,y,cnt=deq.popleft()
        for k in range(4):
            nx=x+dx[k]
            ny=y+dy[k]
            if 0<=nx<N and 0<=ny<N:
                if matrix[nx][ny]==matrix[x][y]+1:
                    deq.append((nx,ny,cnt+1))
                    visitied[x][y]=1
    if cnt>max_len:
        max_len=cnt



T = int(input())
for tc in range(1, T+1):
    N = int(input())
    matrix = [list(map(int, input().split())) for _ in range(N)]
    ans = 0
    visitied = [[0 for _ in range(N)] for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if not visitied[i][j]:
                max_len = 0
                dfs(i, j, 1)
                if max_len > ans:
                    ans = max_len
                    n = matrix[i][j]
                elif max_len == ans and matrix[i][j] < n:
                    n = matrix[i][j]

    

    print(f'#{tc} {n} {ans}')