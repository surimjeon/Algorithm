lst=[]

for i in range(5):
    lst.append(int(input()))

mean=sum(lst)/5
lst.sort()
print(int(mean))
print(lst[2])