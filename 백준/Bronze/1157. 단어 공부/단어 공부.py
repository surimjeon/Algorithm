word=input().upper()
unique=list(set(word))
lst=[]
mx=0
for i in unique:
    cnt=word.count(i)
    if mx<cnt:
        mx=cnt
    lst.append(cnt)

if lst.count(mx)>1:
    print('?')
else:
    mx_idx=lst.index(mx) #어차피 인덱스가 1개면 m의 인덱스값 1개만 찾으면 됨 
    print(unique[mx_idx]) #unique한 값과 lst에 추가되는 순서는 같을것이기 떄문