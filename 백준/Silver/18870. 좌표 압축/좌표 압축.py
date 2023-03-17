import sys

n=int(sys.stdin.readline())
lst=list(map(int,sys.stdin.readline().split()))

#lst를 정렬한 값을 먼저저장한다
st=list(set(lst))
st.sort() #-10 -9 2 4
dic=dict()

#딕셔너리로 값을 키로, 인덱스를 값으로 넣는다
for i in range(len(st)):
    dic[st[i]]=i

#lst를 돌면서 각각 순서대로 키에 대한 값을 찾아서 print함
for num in lst:
    print(dic[num],end=' ')