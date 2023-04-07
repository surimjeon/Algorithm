T=int(input())
for t in range(T):
    PS=input()
    queue=[]
    printing='YES'
    for ps in PS:
        if ps=='(':
            queue.append(ps)
        else:
            try:
                queue.pop()
            except:
                printing='NO'
    if queue:
        printing='NO'
    print(printing)