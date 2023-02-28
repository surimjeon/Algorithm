for tc in range(4):
    x1, y1, p1, q1, x2, y2, p2, q2 = map(int, input().split())

    # 점:c인 경우
    if (p1 == x2 and q1 == y2) or (x1 == p2 and q1 == y2) or (x1 == p2 and y1 == q2) or (p1 == x2 and y1 == q2):
        print('c')
    # 공통부분이 없는경우
    elif p1 < x2 or x1 > p2 or y1 > q2 or y2 > q1:
        print('d')
    # 선분인 경우
    elif x1 == p2 or x2 == p1 or q1 == y2 or q2 == y1:
        print('b')
    else:
        print('a')