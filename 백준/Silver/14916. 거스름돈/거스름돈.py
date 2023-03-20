n=int(input())

ans=0

if n%5==0:
    ans=n//5
else:
    for i in range((n//5),-1,-1): #0,1,2
        if (n-(5*i))%2==0:
            ans=i+((n-(5*i))//2)
            break
    else:
        ans=-1

print(ans)