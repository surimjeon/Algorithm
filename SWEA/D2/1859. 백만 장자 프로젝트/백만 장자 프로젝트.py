TC = int(input())

for tc in range(1,TC+1):
    n = int(input())
    stack = list(map(int, input().split()))

    result=0

    mx=stack.pop()
    while stack:
        price=stack.pop()
        if mx<price:
            mx=price
        else:
            result+=(mx-price) #최대값에서 요소들을 뺀값이 결과값

    print(f'#{tc} {result}')