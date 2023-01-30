import sys
input=sys.stdin.readline

number=int(input())
lst=[]

for i in range(number):
    x,y=map(int, input().split())
    lst.append([x,y])

lst.sort()

for i in range(number):
    print(lst[i][0],lst[i][1])