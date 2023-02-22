def pre(start):
    global result
    if start!='.': #start는 재귀에서 쓰이는 매개변수!!
        result+=start
        pre(tree[start][0])
        pre(tree[start][1])
def inorder(start):
    global result
    if start!='.': #start는 재귀에서 쓰이는 매개변수!!
        inorder(tree[start][0])
        result+=start
        inorder(tree[start][1])

def post(start):
    global result
    if start!='.': #start는 재귀에서 쓰이는 매개변수!!
        post(tree[start][0])
        post(tree[start][1])
        result+=start
        



n=int(input())
tree={} #숫자를 키로 할 수 없으니, 알파벳자체를 키로 두는 딕셔너리 생성

result=''
#왼쪽 노드, 오른쪽 노드 부모를 넣었다는거.. 
for i in range(n):
    node,left,right=input().split()
    tree[node]=[left,right] #딕셔너리로 묶어주기

result=''
pre('A')
print(result)
result=''
inorder('A')
print(result)
result=''
post('A')
print(result)
