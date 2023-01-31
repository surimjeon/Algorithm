test=0

import sys

while True:
    numbers=int(input())
    if numbers==0:
        break
    else:
        test+=1
    
    name_lst=[]
    for number in range(numbers):
        names=sys.stdin.readline().strip() #한줄씩 읽어오기(개행문자 제거 strip)
        name_lst.append(names)

    lst=[]
    for number in range(2*numbers-1):
        inx, word= input().split()
        lst.append(int(inx))
    
    idx=0
    for i in range(1, numbers+1): #[1,2, 1]
        if lst.count(i)==1: 
            idx=i
            break

    print(test, name_lst[idx-1])        