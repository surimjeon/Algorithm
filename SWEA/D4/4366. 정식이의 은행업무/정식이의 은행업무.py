T=int(input())

for tc in range(1,T+1):
    bin=input() #문자열이기 떄문에 슬라이싱 가능
    three=input()
    
    #이진수의 값을 10진수로 변환
    #모든 경우의 수 리스트에 저장
    lst=[]
    for i in range(len(bin)):
        if bin[i]=='0':
            a=bin[:i]+'1'+bin[i+1:]
            lst.append(int(a,2))
        else:
            a=bin[:i]+'0'+bin[i+1:]
            lst.append(int(a,2))
    
    for i in range(len(three)):
        for j in '012':
            if three[i]!=j:
                b=three[:i]+j+three[i+1:]
                int_b=int(b,3)
                if int_b in lst:
                    print(f'#{tc} {int_b}')

                