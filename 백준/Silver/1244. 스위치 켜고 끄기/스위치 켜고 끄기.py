def change(num):
    if switch[num]==1:
        switch[num]=0
    else:
        switch[num]=1


n=int(input()) #스위치 개수
switch=[-1]+list(map(int,input().split())) #인덱스가 번호인데(1부터시작함)
m=int(input()) #학생 수

for _ in range(m):
    sex,num=map(int,input().split())
    if sex==1:
        for i in range(num,n+1,num):
            change(i)
    else:
        change(num)
        for j in range(n//2):
            if num + j > n or num - j < 1 : break
            if switch[num-j]==switch[num+j]:
                change(num-j)
                change(num+j)
            else:
                break


for i in range(1, n+1):
    print(switch[i], end=' ')
    if i%20==0:
        print()