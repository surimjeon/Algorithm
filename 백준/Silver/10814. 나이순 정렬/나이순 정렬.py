import sys

n=int(sys.stdin.readline().rstrip()) #회원의 수
lst=[]

for i in range(n):
    age, name= sys.stdin.readline().rstrip().split()
    age=int(age)
    lst.append((age,name))

lst.sort(key=lambda x: x[0]) #키값 모두를 가져와서 정렬해야함(items())

for l in lst:
    print(l[0],l[1])