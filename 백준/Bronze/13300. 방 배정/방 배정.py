import math
N, K= map(int, input().split())


rooms=[0]*12
counts=0

for number in range(N):
    S,Y= map(int, input().split()) #S 0 1~6
    if S==0:
        rooms[Y-1]+=1
    elif S==1:
        rooms[Y+5]+=1

for i in rooms:
    count=math.ceil(i/K)
    counts+=count
    
print(counts)