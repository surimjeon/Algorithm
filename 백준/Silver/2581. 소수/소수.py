#소수구하기
#소수는 2부터 나전까지 나눠지는게 있으면 pass, 없으면 break

#소수를 판별하는 함수
def sosu(num):
    if num>1:
        for i in range(2,num):
            if num%i!=0:
                pass
            else:
                return 0
        return 1 #for문을 다 돌고나서 1을 반환할거야(판별할꺼야)
            
M=int(input())
N=int(input())

lst=[]
for i in range(M,N+1):
    if sosu(i)==1:
        lst.append(i)

if len(lst)>0:
    print(sum(lst))
    print(min(lst))
else:
    print(-1)