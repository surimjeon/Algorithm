import sys

n=int(sys.stdin.readline())
n_lst=list(map(int, sys.stdin.readline().split()))
m=int(sys.stdin.readline())
m_lst=list(map(int, sys.stdin.readline().split()))

dict={}
for i in n_lst: #각 숫자의 count를 해줌(i는 key값)
    if i in dict:
        dict[i]+=1
    else:
        dict[i]=1

for j in m_lst: #
    result=dict.get(j)
    if result==None:
        print(0, end=' ')
    else:
        print(result, end=' ')