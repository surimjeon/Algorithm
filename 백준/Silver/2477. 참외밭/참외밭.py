K=int(input())
height=[] #누적하고 싶다면 for문 밖에서 초기값지정(아님, 다시 원래0으로 돌아옴)
width=[]
lst=[]
for i in range(6):
    w, length=map(int, input().split())
    if w==1 or w==2:
        width.append(length)
        lst.append(length)
    elif w==3 or w==4:
        height.append(length)
        lst.append(length)
#전체넓이
whole=max(width) * max(height)
width_idx=lst.index(max(width))
height_idx=lst.index(max(height))
# 작은 사각형 구하기
#가로값=세로 최대값의 다음값에서 세로 최대값 이전의 가로값을 뺴준 것 

small_width=abs(lst[(height_idx-1)%6]-lst[(height_idx+1)%6])
 #%6하는 이유는 런타임에러가 나기 떄문(index가 충분히 커지게 되면 런타임 에러..)
small_height=abs(lst[(width_idx-1)%6]-lst[(width_idx+1)%6])

ans=(whole-(small_width*small_height))*K
print(ans)