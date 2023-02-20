T = int(input())
import math

for tc in range(1, T + 1):
    n = int(input())
    x = math.ceil(n ** (1 / 3))
    if x ** 3 == n:
        print(f'#{tc} {x}')
    else:
        print(f'#{tc} -1')
