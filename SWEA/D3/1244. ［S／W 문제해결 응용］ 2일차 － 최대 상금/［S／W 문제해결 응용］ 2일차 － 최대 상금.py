#재귀형태로 dfs, 가지치기 하기

def dfs(money,cnt):
    global result, existed
    #기저조건
    if cnt==0:
        existed[cnt].add(int(''.join(money)))
        return
    #가지치기 set으로 중복을 없애서 중복되는 값이 나오면 return
    if int(''.join(money)) in existed[cnt]: #이미 존재한다면 return 돌지 않음
        return 
    
    existed[cnt].add(int(''.join(money)))
    
    #메인로직
    for i in range(len(money)):
        for j in range(i+1, len(money)):
            money[i], money[j]=money[j],money[i]
            dfs(money, cnt-1)
            money[i], money[j]=money[j],money[i]
        
        
    
T=int(input())

for tc in range(1,T+1):
    money, cnt=map(int,input().split())
    #앞의 인덱스가 점점 더 커야 함.. -> 
    existed=[set() for _ in range(cnt+1)] 
    #횟수마다 모든 결과값이 초기화해야 그 가지들의 중복값을 체크할 수 있음 
    dfs(list(str(money)),cnt)
    
    print(f'#{tc} {max(existed[0])}')
    
    #ex)set1 : 132 321 / set2: 123 231...이렇게 각각 중복값 체크하기 위해 set을 여러개 만들어줌 