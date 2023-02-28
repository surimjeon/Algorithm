n=int(input())
max_lst=[]
for num in range(1,n+1):
    lst=[n] #append를 하면 계속 100이 추가되기 때문에 초기화를 시켜줘야함!!!
    lst.append(num)
    i=1
    while True:
        next_item=lst[i-1]-lst[i]
        if next_item<0:
            break
        lst.append(next_item)
        i+=1

    if len(max_lst)<len(lst):
        max_lst=lst
print(len(max_lst))
print(*max_lst)