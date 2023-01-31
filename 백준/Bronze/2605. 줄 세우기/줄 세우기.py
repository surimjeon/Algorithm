n=int(input())
numbers=list(map(int, input().split()))

lst=[]

for i in range(len(numbers)):
    lst.insert(numbers[i],i+1)

lst=lst[::-1]

for k in lst:
    print(k, end=' ')