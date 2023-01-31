import sys

data=[int(sys.stdin.readline().strip()) for i in range(9)]

na=sum(data)-100
one=0
two=0

for i in range(len(data)):
    for j in range(i+1,len(data)):
        hap=data[i]+data[j]
        if hap==na:
            one, two=data[i], data[j]
            break

data.remove(one)
data.remove(two)

data.sort()

for i in data:
    print(i)