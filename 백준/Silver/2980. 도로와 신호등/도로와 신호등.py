n, l = map(int, input().split())  # 신호등 개수, 도로의 길이
# 계속반복되는 r,g ->for문 사용
# 내 위치
position = time = idx= 0
r_range=[]
g_range=[]
d_range=[]

for i in range(1,n+1):
    d, r, g = map(int, input().split())
    r_range.append(r)
    g_range.append(g)
    d_range.append(d)

while True:
    if idx>=n:
        time += 1
        position += 1
    else:
        if position == d_range[idx]:
            if time % (r_range[idx] + g_range[idx]) > r_range[idx] or time % (r_range[idx] + g_range[idx])==0:
                position += 1
                time += 1
                idx+=1
            else:
                time += 1
        else:
            time += 1
            position += 1
    if position==l:
        break

print(time-1)