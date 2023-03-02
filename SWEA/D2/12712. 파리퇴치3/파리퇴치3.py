def plus(x, y):
    result = mapp[x][y]
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    # 4개방향으로 탐색할껀데, m-1개 만큼 더 가면 방향 바꿀꺼야
    for j in range(4):
        for i in range(1,m):
            nx = x + i * (dx[j])
            ny = y + i * (dy[j])
            if 0 <= nx < n and 0 <= ny < n:
                result += mapp[nx][ny]
    return result

def x_fuc(x, y):
    result = mapp[x][y]
    dx = [-1, 1, 1, -1]
    dy = [-1, 1, -1, 1]
    # 4개방향으로 탐색할껀데, m-1개 만큼 더 가면 방향 바꿀꺼야
    for j in range(4):
        for i in range(1,m):
            nx = x + i * (dx[j])
            ny = y + i * (dy[j])
            if 0 <= nx < n and 0 <= ny < n:
                result += mapp[nx][ny]
    return result


T = int(input())
for tc in range(1, T + 1):
    lst=[]
    n, m = map(int, input().split())
    mapp = [list(map(int, input().split())) for _ in range(n)]
    for x in range(n):
        for y in range(n):
            lst.append(plus(x, y))
            lst.append(x_fuc(x, y))

    # 둘중 최대인것 출력
    print(f'#{tc} {max(lst)}')
