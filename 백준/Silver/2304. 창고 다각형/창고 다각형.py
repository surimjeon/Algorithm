#높이*넓이라고 생각하지 않고, 높이,높이,높이..로 생각해보기
 
n=int(input())
mxh=mxl=0
lst=[]

for _ in range(n):
    l,h=map(int,input().split())
    lst.append([l,h])
    if mxh<h:
        mxh=h
        mx_idx=l
    if mxl<l:
        mxl=l
    
empty_lst=[0]*(mxl+1)
for l,h in lst:
    empty_lst[l]=h  #[0, 0, 4, 0, 6, 3, 0, 0, 10, 0, 0, 4, 0, 6, 0, 8] 

now_h=0
total=0
for i in range(mx_idx+1):
    if empty_lst[i]>now_h:
        now_h=empty_lst[i]
    total+=now_h

now_h=0
for j in range(mxl,mx_idx,-1):
    if now_h<empty_lst[j]:
        now_h=empty_lst[j]
    total+=now_h
print(total)