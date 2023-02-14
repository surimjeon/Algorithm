TC = int(input())

for tc in range(1,TC+1):
    n = int(input())
    stack = list(map(int, input().split()))
    result = 0

    #스택에 넣어져있는 최대값을 매기는 변수
    mx=stack.pop()
    while stack:
        #스택 요소를 하나씩 빼내면서 mx최대값을 갱신
        price=stack.pop()
        if mx<price:
            mx=price
        else:
            result+= mx-price
    print(f'#{tc} {result}')

        #최대값이 갱신되지 않는 값이라면 사야하는 금액