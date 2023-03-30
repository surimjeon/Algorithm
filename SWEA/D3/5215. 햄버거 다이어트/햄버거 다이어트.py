

def dfs(i,kal,score):
    global mx
    if kal>l: #kal가 제한보다 높디면 반환
        return   
    mx=max(mx,score) #mx값 갱신
    if i==n: #주의! mx값을 갱신한 후에 인덱스를 체크해줘야 마지막 값이 반영된다
        return
    #재료를 넣지 않는 경우
    dfs(i+1,kal,score)
    #재료를 넣는경우
    dfs(i+1,kal+mapp[i][1],score+mapp[i][0])


T=int(input())

for tc in range(1,T+1):
    n,l=map(int,input().split())
    
    mapp=[list(map(int,input().split())) for _ in range(n)] #맛 점수, 칼로리
    
    mx=0
    dfs(0,0,0)
    print(f'#{tc} {mx}')