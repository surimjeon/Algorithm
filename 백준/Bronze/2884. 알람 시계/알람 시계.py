H,M=map(int, input().split())
if H != 0:
    if M>=45:
        M2 = M -45 #M은 M-45의 값이 들어옴
        print(H,M2)
    else:
        H2 = H-1
        M2 = M + 15   
        print(H2,M2)
if  H == 0:
    if M>=45:        
        M2 = M -45 
        print(H,M2)
    else:
        H2 = 23
        M2 = M + 15
        print(H2,M2)
