h,w=map(int,input().split())
#1키로씩 동쪽으로 이동

for i in range(h):
    sky=list(input())
    num=-1
    for j in range(w): #0 1 2 3
        if sky[j]=='c':
            if num==-1:
                num+=1
                sky[j]=num
            else:
                num=0
                sky[j]=num
        elif sky[j]=='.':
            if num==-1:
                sky[j]=num
            else:
                num+=1
                sky[j]=num

    print(*sky)
