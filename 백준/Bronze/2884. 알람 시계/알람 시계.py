H,M=map(int, input().split())
if H != 0:
    if 45<=M: #분이 70,80분으로 넘어갈 수도 있음..
        print(H,M -45)
    else:  
        print(H-1,M + 15)
if H==0:
    if M>=45:        
        print(H,M -45)
    else:
        H = 23
        print(H,M + 15)