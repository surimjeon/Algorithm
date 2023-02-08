N=int(input())
A=list(map(int,input().split()))
B=list(map(int,input().split()))

b_prime=sorted(B)
A.sort(reverse=True)


sum=0
for i in range(N):
    sum+=A[i]*b_prime[i]

print(sum)