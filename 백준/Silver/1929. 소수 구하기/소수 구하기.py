m,n=map(int,input().split())

isprime=[]
isprime=[True for i in range(n+1)]
for i in range(2, int(n**0.5)+1):
    if isprime[i]==True: 
        j=2
        while i*j<=n: #2의 배수, 3의 배수, 4의 배수..모두 지움
            isprime[i*j]=False
            j+=1

for i in range(m,n+1):
    if isprime[i]:
        if i!=1:
            print(i)