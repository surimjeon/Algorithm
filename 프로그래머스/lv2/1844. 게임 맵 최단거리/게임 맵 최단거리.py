from collections import deque

def solution(maps):
    #n과 m정의
    n=len(maps)
    m=len(maps[0])
    
    #dx,dy 정의
    dx=[1,0,-1,0]
    dy=[0,1,0,-1]
    queue=deque()

    
    def bfs(start_x,start_y,cnt):
        queue.append((start_x,start_y,cnt))
        maps[start_x][start_y]=0
        
        while queue:
            x,y,cnt=queue.popleft()
            if x==n-1 and y==m-1:
                return cnt+1
            for k in range(4):
                nx=x+dx[k]
                ny=y+dy[k]
                if 0<=nx<n and 0<=ny<m and maps[nx][ny]==1:
                    maps[nx][ny]=0
                    queue.append((nx,ny,cnt+1))
        return -1
                    
    answer = bfs(0,0,0)
    return answer