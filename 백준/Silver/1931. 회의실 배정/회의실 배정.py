n=int(input())

lst=[]
for i in range(n):
    s,e=map(int,input().split())
    lst.append([s,e])
    

lst=sorted(lst,key=lambda x : x[0])
lst=sorted(lst,key=lambda x : x[1])

last=0
cnt=0
for start, end in lst:
    if start >= last:
        cnt+=1
        last=end
print(cnt)