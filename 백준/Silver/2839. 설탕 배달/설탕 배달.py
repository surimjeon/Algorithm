kilo=int(input())
count=0

if kilo%5==0:
    count=kilo//5
else : 
    for i in range(kilo//5,-1,-1):
        mok=kilo-i*5
        if mok%3==0:  #2번째 케이스, 3kg과 5kg을 조합해서 담을 수 있을 때. 3으로 나눠 떨어짐
            count=i+mok//3
            break
        else : 
            count=-1

print(count)
