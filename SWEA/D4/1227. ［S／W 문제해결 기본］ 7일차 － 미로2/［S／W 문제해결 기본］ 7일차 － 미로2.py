# 10개의 테스트케이스
from collections import deque

def bfs(start_x, start_y, end_x, end_y):
    mapp[start_x][start_y] = 1
    mapp[end_x][end_y] = 0
    queue = deque([(start_x, start_y)])
    while queue:
        (x, y) = queue.popleft()
        if (x, y) == (end_x, end_y):
            return 1
        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]
            if 0 <= nx < 100 and 0 < ny < 100 and mapp[nx][ny] == 0:
                queue.append([nx, ny])
                mapp[nx][ny]=2
    return 0


for tc in range(1, 11):
    T=int(input())
    mapp = [list(map(int, input())) for _ in range(100)]
    dx = [-1, 0, 1, 0]
    dy = [0, -1, 0, 1]
    for i in range(100):
        for j in range(100):
            if mapp[i][j] == 2:
                start_x, start_y = i, j
            if mapp[i][j] == 3:
                end_x, end_y = i, j

    a=bfs(start_x, start_y, end_x, end_y)
    print(f'#{tc} {a}')