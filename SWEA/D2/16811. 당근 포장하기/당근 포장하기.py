T = int(input())

for tc in range(1, T + 1):
    n = int(input())
    ci = list(map(int, input().split()))
    # 3개의 구역으로 나눠야함..(최대, 최소 구하고)
    ci.sort()
    minv=1000
    #통을 만들기
    for i in range(n - 2): #소 박스
        for j in range(i + 1, n - 1): #중박스
            if ci[i]!=ci[i + 1] and ci[j]!=ci[j + 1]: #같은 크기가 다른 박스에 들어가는 경우 제외(이 경우는 다음단계로 pass)
                A= i + 1 #소박스의 길이
                B= j - i #중박스의 길이(중박스 포함된 전체에서 소박스를 뺀 것)
                C= n-1-j #대박스의 길이(전체-중박스)
                if A*B*C!=0 and A <= n // 2 and B <= n // 2 and C <= n // 2: #빈 박스없고 절반 초과하는 박스도 없으면
                    if minv>max(A,B,C)-min(A,B,C):
                        minv=max(A,B,C)-min(A,B,C)
    if minv==1000:
        minv=-1 #포장을 못하는 경우 -1
    print(f'#{tc} {minv}')