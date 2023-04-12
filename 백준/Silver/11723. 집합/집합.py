import sys
input=sys.stdin.readline
n=int(input())
s=set()

for _ in range(n):
    cal=list(input().split())
    if len(cal)==1:
        if cal[0]=='all':
            s=set([i for i in range(1,21)])
        elif cal[0]=='empty':
            s=set()

    elif len(cal)==2:
        num=int(cal[1])
        if cal[0]=='add':
            s.add(num)
        elif cal[0]=='remove':
            s.discard(num)
        elif cal[0]=='check':
            print(1 if num in s else 0)
        elif cal[0]=='toggle':
            if num in s:
                s.discard(num)
            else:
                s.add(num)