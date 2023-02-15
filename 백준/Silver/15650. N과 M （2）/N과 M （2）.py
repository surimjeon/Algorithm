#수열(겹치지 않게,,)
#부분집합 처럼 

n,m=map(int,input().split())

def f1(i,k,count):
    if i==k: 
        if count==m:
            for idx,bit in enumerate(bits):
                if bit:
                    print(a[idx], end=' ')
            print()
        return
    bits[i]=1
    f1(i+1,k,count+1)
    bits[i]=0
    f1(i+1,k,count)
    
    
a=[i for i in range(1,n+1)]
bits=[0]*len(a)
f1(0,n,0)

