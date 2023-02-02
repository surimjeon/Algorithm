def cnt(lst, i):
    count=0
    for j in range(1, lst[0]+1):
        if lst[j]==i:
            count+=1
    return count
            
N=int(input())

for i in range(N): #라운드 수
    A=list(map(int, input().split()))
    B=list(map(int, input().split()))
 
    for i in range(4,0,-1): 
        if cnt(A,i)<cnt(B,i):
            print('B')
            break
        elif cnt(A,i)>cnt(B,i):
            print('A')
            break
        else :
            #다음 3의 개수 비교
            continue
    else :
        print('D')