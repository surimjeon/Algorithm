#블록 중간을 가로지를 수 없음, 최단거리 찾기
r,c=map(int,input().split())
k=int(input()) #상점의 개수
dir_lst=[]
d=[]
for _ in range(k):
    dir, dist=map(int,input().split())
    dir_lst.append(dir)
    d.append(dist)
m,me=map(int,input().split())

s=0

for i in range(k):
    if m==dir_lst[i]:
        s+=abs(me-d[i])
    elif (m==1 and dir_lst[i]==2) or (m==2 and dir_lst[i]==1):
        s+=min(me+d[i],(r-me)+(r-d[i]))+c
    elif (m==3 and dir_lst[i]==4) or (m==4 and dir_lst[i]==3):
        s+=min(me+d[i],(r-me)+(r-d[i]))+r
    elif m==1:
        if dir_lst[i]==3:
            s+=min(me+d[i], 2*c-me+2*r-d[i])
        elif dir_lst[i]==4:
            s+=min(r-me+d[i], 2*c+me+r-d[i])
    elif m==2:
        if dir_lst[i]==4:
            s+=min(r-me+c-d[i], me+c+r+d[i])
        elif dir_lst[i]==3:
            s+=min(me+c-d[i], 2*r-me+c+d[i]) #6 
    elif m==3:
        if dir_lst[i]==1:
            s+=min(me+d[i], 2*c-me+2*r-d[i])
        elif dir_lst[i]==2:
            s+=min(c-me+d[i], 2*c+me+r-d[i])
    elif m==4:
        if dir_lst[i]==1:
            s+=min(me+r-d[i], 2*c-me+r+d[i])
        elif dir_lst[i]==2:
            s+=min(r-me+d[i], c+me+2*r-d[i])
    
print(s)

        
