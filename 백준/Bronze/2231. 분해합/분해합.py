n=int(input())

for i in range(1,n+1):
    nu=list(map(int,str(i)))
    hap=i+sum(nu)
    if hap==n:
        print(i)
        break
    if i==n:
        print(0)