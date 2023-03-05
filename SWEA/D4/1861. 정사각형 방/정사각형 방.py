
def check(x,y):
    dx=[1,0,-1,0]
    dy=[0,-1,0,1]
    global cnt
    for k in range(4):
        nx=x+dx[k]
        ny=y+dy[k]
        if 0<=nx<n and 0<=ny<n and mapp[nx][ny]-mapp[x][y]==1:
            cnt+=1
            check(nx,ny)

T=int(input())

for tc in range(1,T+1):
    n=int(input())
    mapp=[list(map(int,input().split())) for _ in range(n)]
 
    lst=[0]*(n**2+1)
    for i in range(n):
        for j in range(n):
            cnt=1
            current=mapp[i][j]
            check(i,j)
            lst[current]=cnt #처음 출발 방번호를 index로 지정해놓고, count를 값으로 지정해줘서 찾았다
    room=max(lst)
    room_n=lst.index(room)
    print(f'#{tc} {room_n} {room}')