arr=[list(map(int,input().split())) for i in range(9)]

x=0
y=0
mx=-1

for i in range(9):
    for j in range(9):
        if arr[i][j]>mx:
            mx=arr[i][j]
            x=i+1 #행열이 1부터 시작
            y=j+1

print(mx)
print(x,y)