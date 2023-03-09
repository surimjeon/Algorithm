#달팽이

import sys
n=int(sys.stdin.readline()) #홀수 자연수 n
k=int(sys.stdin.readline())

#가운데 점을 찾고, 중앙부터, 방향: 위, 오,아래,왼, 위, 방향으로 탐색
#3->1,1 / 5->2,2
cen=n//2 #2
mapp=[[0]*n for _ in range(n)]

dx=[0,1,0,-1]  #한줄씩 증가하면 2씩증가...하는 맵,,(오, 아, 왼, 위)
dy=[1,0,-1,0]

x=y=cen
num=1
mapp[x][y]=num
ln=0
ans=[]
if num==k:
    ans=[x+1,y+1]

while True: 
    for dir in range(4):
        for _ in range(ln): #이동하는 걸 0번반복,, 2번반복,,,4번반복,,,
            x+=dx[dir] #해당 줄을 4방 탐색함
            y+=dy[dir]
            num+=1
            mapp[x][y]=num
            if num==k:
                ans=[x+1,y+1]
    if x==0 and y==0: #4번을 다 돌았는데, (0,0)까지 왔다면 break
        break
    x-=1 
    y-=1
    ln+=2

for i in range(n):
    print(*mapp[i])
print(*ans)    
    
    