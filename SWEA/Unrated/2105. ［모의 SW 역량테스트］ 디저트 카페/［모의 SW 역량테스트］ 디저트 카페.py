'''
대각선방향으로 움직임, 출발한 카페로 다시 돌아와야함
같은 숫자 디저트는 방문할 수 없음
하나의 카페에서 디저트x
디저트를 먹을 수 없으면 -1
start는 어디든 될 수 있음 
'''

'''
여기서 고려해야할 점! 
현재위치에서 이동할 수 있는 경우의 수는 꺾는 방법과, 현재방향에서 그대로 가는 것 2가지가 있다.

'''

def dfs(x,y,lst,position):
    global i,j,cnt 
    if position==3 and x==i and y==j: #정답처리
        cnt=max(cnt,len(lst))
        return
    
    if position>3: #방향을 종료해주는 조건(방향을 더 꺾지 않게 하기 위해)
        return
        
    #직진하는 경우
    nx=x+dx[position]
    ny=y+dy[position]
    if 0<=nx<n and 0<=ny<n and mapp[nx][ny] not in lst:
        lst.append(mapp[nx][ny])
        dfs(nx,ny,lst,position) 
        lst.pop()
    
        
        lst.append(mapp[nx][ny])
        dfs(nx,ny,lst,position+1) 
        lst.pop()   
    
        
    

T=int(input())

for tc in range(1,T+1):
    n=int(input())
    mapp=[list(map(int,input().split())) for _ in range(n)]
    result=[]
    
    dx=[1,-1,-1,1]
    dy=[1,1,-1,-1]
    
    cnt=-1
    
    for i in range(n):
        for j in range(n):
            dfs(i,j,[],0)
            
    print(f'#{tc} {cnt}')