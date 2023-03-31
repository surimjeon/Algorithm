'''
임의의 시작점에서부터 7칸을 갔을 때 나오는 경우의 수 (중복 제거=set)
4개방향으로 가면서 7칸을 모두 갔다면 set에 추가하기
'''
def dfs(x,y,cnt,lst):
    global st
    if cnt==7: #7칸을 다 가면 끝
        st.add(lst)
        return

    for k in range(4):
        nx=x+dx[k]
        ny=y+dy[k]
        if 0<=nx<4 and 0<=ny<4:
            dfs(nx,ny,cnt+1,lst+mapp[nx][ny])



T=int(input())

for tc in range(1,T+1):
    mapp=[list(input().split()) for _ in range(4)] #문자열로 합치기 위해서 문자열로 받아옴
    dx=[1,0,-1,0]
    dy=[0,1,0,-1]
    st=set()
    for i in range(4):
        for j in range(4):
            dfs(i,j,1,mapp[i][j])
    print(f'#{tc} {len(st)}')