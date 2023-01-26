kilo=int(input())

if kilo%5==0:
    print(kilo//5)
#생각 못했던 것: 5의 몫을 하나씩 줄어가기 보다는, 3씩 빼면서 5의 조합이 가능한지 푸는 방법
else: 
    p=0
    while kilo>0: 
        kilo-=3
        p+=1
        if kilo%5==0:#3kg과 5kg을 조합해서 담을 수 있을 때 
            p+=kilo//5
            print(p)
            break
           
        elif kilo==0:
            print(p) #3으로 나눠 떨어질 때
            break

        elif kilo==1 or kilo==2  : #5도 안나눠지고 3도 안나눠지면->최대 뺀 값이 1또는 2이면 
            print(-1) 
            break
