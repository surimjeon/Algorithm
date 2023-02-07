#n홀수(수의 개수)
#정수입력 (절대값 4000이하)
from collections import Counter
import sys
N=int(sys.stdin.readline())

lst=[]
for i in range(N):
    lst.append(int(sys.stdin.readline()))

lst.sort()

mean=round(sum(lst)/N)
median=lst[N//2]

cnt=Counter(lst)
cnt1=cnt.most_common()
count=cnt1[0][1] #최빈값 횟수

if len(cnt1)==1:
    mode=cnt1[0][0]
elif cnt1[1][1]==count:
    mode=cnt1[1][0]
else:
    mode=cnt1[0][0]

scope=max(lst)-min(lst)

print(mean)
print(median)
print(mode)
print(scope)