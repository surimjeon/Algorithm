'''
1초-아무것도 안함(초기상태) 1
2초-설치되어있지 않은 모든 칸에 폭탄 설치(모두 폭탄) 2
3초 -처음 폭탄 모두 폭발 3
4초-모두 폭탄 2
5초- 1 
6초- 2

2,4,6...은 모든 칸
1초=5초=9초,  3초=7초=11초,

만약,폭탄이 폭발했을 때,인접한 칸에 폭탄이 있는 경우에는 인접한 폭탄은 폭발 없이 파괴된다.
'''

            
r,c,n=map(int,input().split())

mapp=[list(input()) for _ in range(r)] #폭탄 맵'

dx=[0,1,-1,0]
dy=[1,0,0,-1]


if n==1:
    ans=mapp
elif n%2==0:
    ans=[['O']*c for _ in range(r)]
else:
    bomb1=[['O']*c for _ in range(r)]
    for i in range(r):
        for j in range(c):
            if mapp[i][j]=='O': #돌면서 0가 있으면 4방탐색해서 모두 터트리기
                bomb1[i][j]='.'
                for k in range(4):
                    nx=i+dx[k]
                    ny=j+dy[k]
                    if 0<=nx<r and 0<=ny<c and mapp[nx][ny]=='.':
                        bomb1[nx][ny]='.'
                        
    bomb2=[['O']*c for _ in range(r)]
    for i in range(r):
        for j in range(c):
            if bomb1[i][j]=='O': #돌면서 0가 있으면 4방탐색해서 모두 터트리기
                bomb2[i][j]='.'
                for k in range(4):
                    nx=i+dx[k]
                    ny=j+dy[k]
                    if 0<=nx<r and 0<=ny<c and bomb1[nx][ny]=='.':
                        bomb2[nx][ny]='.'
                        

    if n%4==3:
        ans=bomb1
    if n%4==1:
        ans=bomb2

for i in range(r):
    print(''.join(ans[i]))