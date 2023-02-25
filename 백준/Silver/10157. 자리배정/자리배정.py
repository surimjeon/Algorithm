c,r=map(int,input().split()) #격자크기 7*6크기
k=int(input()) #대기번호
mapp=[[0]*c for _ in range(r)]

#방향 쭉 가면서 하나씩 증가시킨 수를 대입할 것임(방문표시도 할꺼고)
x=0
y=0
direction=0 #현재 방향
dx=[0,1,0,-1]
dy=[-1,0,1,0]

if k>r*c:
    print(0)
    exit()

for seat in range(1,c*r+1): #좌석번호 표시하기
    if seat==k:
        print(y+1,x+1) #현재위치 반환
        break
    else:
        mapp[x][y]=seat #맵에다가 좌석번호 표시하고
        x+=dx[direction]
        y+=dy[direction]

        if x<0 or y<0 or x>=r or y>=c or mapp[x][y]!=0: #방문표시 꼭 확인!!
            x-=dx[direction]
            y-=dy[direction]
            direction=(direction+1)%4
            x+=dx[direction]
            y+=dy[direction]
            
