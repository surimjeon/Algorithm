from collections import deque


def tomato(queue):
    dx = [1, 0, -1, 0, 0, 0]
    dy = [0, -1, 0, 1, 0, 0]
    dz = [0, 0, 0, 0, 1, -1]  # 높이(위, 아래)
    while queue:
        a, b, c = queue.popleft()
        for i in range(6):
            nx = a + dx[i]
            ny = b + dy[i]
            nz = c + dz[i]
            if 0 <= nx < h and 0 <= ny < n and 0 <= nz < m and mapp[nx][ny][nz] == 0:
                queue.append([nx, ny, nz])
                mapp[nx][ny][nz] = mapp[a][b][c] + 1

m, n, h = map(int, input().split())  # 가로, 세로, 높이

queue = deque()
# mapp=[[list(map(int,input().split())) for _ in range(n)] for _ in range(h)]
mapp=[]
#혹은
for i in range(h):
    tmp=[]
    for j in range(n):
        tmp.append(list(map(int,input().split()))) #tmp에 한줄 리스트를 3번추가하고 그걸 2번함
        for k in range(m):              #m번반복하면서 2차원배열의 내용이 1인것에 접근
            if tmp[j][k]==1:
                queue.append([i,j,k])
    mapp.append(tmp)

                # 토마토 시작지점이 2개 이상일 수 있다...
tomato(queue)

ans=0
for i in mapp:
    for j in i:
        for k in j:
            if k==0:
                print(-1)
                exit(0)
        ans=max(ans,max(j))
print(ans-1)