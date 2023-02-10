n,m=map(int,input().split())

for i in range(min(n,m),0,-1): #둘중에 작은 아이까지 약수구하기
    if n%i==0 and m%i==0:
        mx_dv=i
        print(mx_dv)
        break

mn_mul=(n//mx_dv)*(m//mx_dv)*mx_dv
print(mn_mul)