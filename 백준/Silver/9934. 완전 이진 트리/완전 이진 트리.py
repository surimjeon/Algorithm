def tree(node, x):
    par=len(node)//2 #부모노드는 가장 중간값
    arr[x].append(node[par]) #부모노드값을 arr에 집어넣기
    if len(node)==1: #마지막에 남아있는 노드가 제일 부모노드 1개가 될때까지 계속 나눠줌
        return
    tree(node[:par],x+1) #왼쪽 트리
    tree(node[par+1:],x+1) #오른쪽 트리
        
k=int(input()) #깊이
node=list(map(int,input().split())) #들어간 순서대로 주어짐 2 1 3 lvr 값
arr=[[] for i in range(k)]
tree(node,0)

for i in arr:
    print(*i)