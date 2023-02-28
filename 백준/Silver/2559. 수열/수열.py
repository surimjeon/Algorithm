import sys

n,k=map(int,sys.stdin.readline().split())
lst=list(map(int,sys.stdin.readline().split()))

first=sum(lst[:k])
first_lst=[first]
for i in range(n-k):
    first=first-lst[i]+lst[i+k]
    first_lst.append(first)

print(max(first_lst))