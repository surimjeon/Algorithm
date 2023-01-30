number=int(input())
lst=[]

for i in range(number):
    x,y=list(map(int, input().split()))
    lst.append([x,y])

lst.sort(key=lambda x:(x[0],x[1]))

for i in range(number):
    print(lst[i][0],lst[i][1])
    