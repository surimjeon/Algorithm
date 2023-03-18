from collections import deque

n=int(input())
lst=list(map(int,input().split())) #이동 숫자
i=0 #현재위치
ans=[] #정답을 저장할 배열

idx=[x for x in range(1,n+1)] #기존 인덱스를 저장해줄 배열 필요
next=lst.pop(i) #종이에 적힌 이동해야 할 칸 수 
ans.append(idx.pop(i)) #인덱스에서 현재 위치 값을 뽑기

while lst:
    if next<0: #idx가 음수면
        i=(i+next)%len(lst)        
    else: #pop한 요소가 있기 때문에 i+next-1해야 함
        i=(i+next-1)%len(lst)
   
    next=lst.pop(i)
    ans.append(idx.pop(i))

print(*ans)

