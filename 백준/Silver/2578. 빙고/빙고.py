
def check(mapp):
    cnt=0
    for i in range(5):
        for j in range(5):
            mapp_r[i][j]=mapp[j][i]

    cross_down=[]
    cross_up=[]
    for i in range(5):
        if sum(mapp[i])==0:
            cnt+=1
        if sum(mapp_r[i])==0:
            cnt+=1
    
    for i in range(5):
        cross_down.append(mapp[i][i])
        cross_up.append(mapp[4-i][i])
    if sum(cross_down)==0:
        cnt+=1
    if sum(cross_up)==0:
        cnt+=1

    if cnt>=3:
        return True
    False
    
mapp=[list(map(int,input().split())) for _ in range(5)]
mapp_r=[[0]*5 for _ in range(5)]
call=[list(map(int,input().split())) for _ in range(5)]
call_n=0 #사회자가 몇번째 불렀니

#사회자가 한줄씩 읽어오기 
for i in range(5):
    for l in range(5):
        for k in range(5): #0 1 2 3 4
            for j in range(5): #0 1 2 3 4
                if call[i][l]==mapp[k][j]: #0
                    mapp[k][j]=0
                    call_n+=1
                    if check(mapp):
                        print(call_n)
                        exit()
