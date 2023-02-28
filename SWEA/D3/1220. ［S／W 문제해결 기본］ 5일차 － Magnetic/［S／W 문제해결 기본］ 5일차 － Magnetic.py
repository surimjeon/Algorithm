for tc in range(1, 11):
    n = int(input())  # 100
    cnt = 0
    mapp = [list(map(int, input().split())) for _ in range(n)]

    for i in range(n):
        stack = []
        for j in range(n):
            if mapp[j][i] == 1:
                if len(stack)==0:
                    stack.append(mapp[j][i])
            elif mapp[j][i] == 2:
                if len(stack)>0 and stack.pop() == 1:
                    cnt += 1

    print(f'#{tc} {cnt}')