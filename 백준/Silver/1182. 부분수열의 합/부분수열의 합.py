'''
n개의 정수로 이뤄진 수열, 크기가 0인 수열 제외
모든 원소를 다 더한 값이 s인 부분수열 개수는?
'''
def cnt(start): #start: 몇번째부터 탐색할건지 지정해줘야함
    global s, num
    if len(ans)>0 and sum(ans)==s:
        num+=1
    for i in range(start,n):
        ans.append(lst[i])
        cnt(i+1)
        ans.pop()
    

n,s=map(int,input().split()) 
lst=list(map(int,input().split())) #n개의 정수..
num=0
ans=[]
cnt(0)
print(num)