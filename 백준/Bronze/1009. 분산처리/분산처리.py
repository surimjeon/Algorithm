counts=int(input())

for count in range(counts):
    under, upper =list(map(int,input().split()))
    under=under%10
    if under in [1,5,6] :
        print(under)
    elif under in [9, 4]:
        if upper%2==0:
            print((under**2)%10)
        else :
            print(under)
    elif under in [2,3,7,8] :
        if upper%4==0:
            print((under**4)%10)
        elif upper%4==1:
            print(under)
        elif upper%4==2:
            print((under**2)%10)
        else:
            print((under**3)%10)
    else :
        print(10)