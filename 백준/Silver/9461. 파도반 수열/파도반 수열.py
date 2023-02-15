#1 1 1 2 2 3 4 5 7 9 12 16(12+4)
T=int(input())

for tc in range(T):
    p=[1,1,1,2,2]

    n=int(input())

    for i in range(5,n+1):
        p.append(p[i-1]+p[i-5])

    print(p[n-1])
