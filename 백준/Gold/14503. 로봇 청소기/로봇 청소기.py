from collections import deque
import sys


def robot(r,c,d):
    cnt=1
    queue=deque()
    mapp[r][c]=2
    queue.append((r,c,d))
    
    #4개방향을 모두 탐색하는 코드
    while queue:
        r,c,d=queue.popleft()
        new_d=d
        for i in range(4): #4방탐색하고 청소하지 않은 빈칸이 있으면, 90도회전하고 한칸 전진
            new_d=(new_d-1)%4#주의: 방향을 여기서 바꾼다. 그 이유는 90도 회전하면서 탐색했을 떄 조건을 보기 위해
            nx=r+dx[new_d]
            ny=c+dy[new_d]
            if 0<=nx<n and 0<=ny<m and mapp[nx][ny]==0: #시계방향이 청소안했으면
                cnt+=1
                queue.append((nx,ny,new_d))
                mapp[nx][ny]=2 #청소
                break
            elif i==3: #한바퀴를 다 돌았는데, 위 조건을 만족하지 못했다면, 
                #1)다 청소했기 떄문에 back/ 2)뒤에 벽이라 후진할 수 없다면 cnt반환
                nx=r-dx[d]
                ny=c-dy[d] #후진한후 또 다시 돌아보기
                queue.append((nx,ny,d))
                
                if mapp[nx][ny]==1:
                    return cnt


n,m=map(int,sys.stdin.readline().split())
r,c,d=map(int,sys.stdin.readline().split()) #로봇이 있는 r행, c열, d방향 0:북, 1:동, 2:남, 3:서
mapp=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]

dx=[-1,0,1,0] #0:북, 1:동, 2:남, 3:서 #-1씩 감소
dy=[0,1,0,-1]


ans=robot(r,c,d)
print(ans)