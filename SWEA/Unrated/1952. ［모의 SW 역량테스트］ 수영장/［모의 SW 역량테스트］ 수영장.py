'''
수영장
1일 이용권, 1달 이용권, 3달 이용권(년도가 넘어갈수는 없다), 1년이용권(1월1일부터)
가장 적은 비용으로 수영장 이용 방법은?
포함할지 안할지를 결정하면 됨

'''
def back(n,sm):
    global ans
    if ans<=sm: #가지치기(이미 최소값보다 넘어가면 return)
        return
    if n>12: #12월 안일 떄
        ans=min(ans,sm) #최소값 갱신 
        return
    
    back(n+1, sm+day*lst[n])
    back(n+1, sm+month)
    back(n+3, sm+three)
    back(n+12,sm+year)

T=int(input())

for tc in range(1,1+T):
    day, month, three, year=map(int,input().split())
    lst=[0]+list(map(int,input().split()))
    
    ans=365*3000
    back(1,0)
    print(f'#{tc} {ans}')