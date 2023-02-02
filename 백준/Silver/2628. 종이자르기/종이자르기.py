mx_height, mx_width= map(int, input().split())  #10 8
cut=int(input())
width=[0, mx_width]
height=[0, mx_height]
for i in range(cut):
    w, number= map(int,input().split())
#가로길이 구하기 #4
    if w==0:
        width.append(number)
    elif w==1: #세로길이 구하기(세로숫자가 잘리는 것) #2,3
        height.append(number)

width.sort()
height.sort()

width_diff=[]
for i in range(len(width)-1):
    diff=width[i+1]-width[i]
    width_diff.append(diff)

height_diff=[]
for i in range(len(height)-1):
    diff=height[i+1]-height[i]
    height_diff.append(diff)

#리스트 각각을 곱하기
result=[]
for h in height_diff:
    for w in width_diff:
        result.append(h*w)

print(max(result))