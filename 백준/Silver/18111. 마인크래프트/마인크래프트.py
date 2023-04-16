import sys
n,m,b=map(int,input().split())
mapp=[list(map(int,input().split())) for _ in range(n)]

mn=9999999999
height=0
for h in range(257):
    use = 0
    take = 0
    for x in range(n):
        for y in range(m):
            if mapp[x][y]<h: #추가하기
                use+=h-mapp[x][y]
            else:  #빼기
                take+=mapp[x][y]-h
    if take+b<use:
        continue
    if take*2+use<=mn:
        mn=take*2+use
        height=h

print(mn,height)