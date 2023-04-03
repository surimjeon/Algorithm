
def make_set():
    global p
    p=[i for i in range(n+1)] #각각 자신을 부모로 가지는 배열

#대표자를 찾는 find 함수(재귀 +이전 대표자를 현재대표자로 정정하는 기능)
def find_set(x):
    #기저조건: 부모노드로 자기자신을 가진다면 해당노드를 반환함(=루트노드)
    if x==p[x]:
        return x
    p[x]=find_set(p[x]) #타고타고 자신의 부모를 찾아서 리스트자리에 명시해줌
    return p[x]


def union(x,y):
    x=find_set(x) #x집합의 대표자
    y=find_set(y)  # y집합의 대표자
    p[y]=x #임의로 y에 x를 대표자로 선출한다!
    return x

T=int(input())

for tc in range(1,T+1):
    n,m=map(int,input().split()) #n:노드의 개수, m: 간선의 개수
    p=[]
    make_set() #초기화
    for i in range(m):
        u,v=map(int,input().split())
        union(u,v) #노드를 합쳐서 그래프를 만든다
    
    reps=set() #대표자들(각 노드의 대표자가 겹칠 수 있기 때문에, set을 활용한다)
    for node in range(1,n+1):
        reps.add(find_set(node))
        
    print(f'#{tc} {len(reps)}')