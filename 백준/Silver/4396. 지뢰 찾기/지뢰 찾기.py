#지뢰
'''
n
mapp
visited
8방 탐색하면서 visited에 x가 있으면 mapp을 탐색하면서 주변에 *가 몇개 있는지 세리고
visited에 숫자를 넣음..
->visited출력

'''

def search():
    dx=[1,0,-1,0,1,-1,1,-1]
    dy=[0,-1,0,1,1,-1,-1,1]
    
    for i in range(n):
        for j in range(n):
            cnt=0
            if mapp[i][j]=='.' and visited[i][j]=='x':
                for k in range(8):
                    nx=i+dx[k]
                    ny=j+dy[k]
                    if 0<=nx<n and 0<=ny<n and mapp[nx][ny]=='*':
                        cnt+=1
                visited[i][j]=str(cnt)
            elif mapp[i][j]=='*' and visited[i][j]=='x': #지뢰가 있는 칸이 열렸다면 모든 칸 별표로 표시
                for a in range(n):
                    for b in range(n):
                        if mapp[a][b]=='*':
                            visited[a][b]='*'
                            

n=int(input())
mapp=[list(input()) for _ in range(n)]
visited=[list(input()) for _ in range(n)]

search()

for i in range(n):
    print(''.join(visited[i]))