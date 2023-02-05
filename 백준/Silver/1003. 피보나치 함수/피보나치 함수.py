TC=int(input())

for tc in range(TC):
    n=int(input())
    zero=[1,0,1]
    one=[0,1,1] #초기 셋팅(피보나치 규칙을 이룸)

    if n>=3:
        for i in range(3,n+1):
            zero.append(zero[i-2]+zero[i-1])
            one.append(one[i-2]+one[i-1])
    print(zero[n], one[n])
