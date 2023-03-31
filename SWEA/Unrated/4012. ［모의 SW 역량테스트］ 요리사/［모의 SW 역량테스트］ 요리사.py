
def cook(i,a_lst,b_lst): #i:현재 인덱스를 표시
    global mn
    if i==n:
        if len(a_lst)==n//2: #A음식에 선택된 재료 개수가 n//2라면
            asum=bsum=0 
            for j in range(n//2):
                for k in range(n//2): #a_lst와 b_lst에 있는 음식 인덱스를 접근해서 asum과 bsum에 추가
                    asum+=mapp[a_lst[j]][a_lst[k]]
                    bsum+=mapp[b_lst[j]][b_lst[k]]
            mn=min(mn, abs(asum-bsum))           #두 음식간 차이와 mn값 비교     
        return
    
    cook(i+1, a_lst+[i], b_lst) # A의 식재료 번호가 들어감
    cook(i+1, a_lst, b_lst+[i]) #B에 식재료 번호 포함


T=int(input())

for tc in range(1,T+1):
    n=int(input())
    mapp=[list(map(int,input().split())) for _ in range(n)]
    mn=20000*n*n
    cook(0,[],[])    
    print(f'#{tc} {mn}')