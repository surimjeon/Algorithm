n,m=map(int,input().split())

if str(n)[::-1]< str(m)[::-1]:
    print(str(m)[::-1])
else:
    print(str(n)[::-1])
