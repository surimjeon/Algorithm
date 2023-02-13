T= int(input())

for tc in range(1, T+1):
    n=int(input())

    tri=[1]
    print(f'#{tc}')
    print(*tri)
    for i in range(n-1):
        #현재줄의 맨처음과 끝에 있는 1은 더할게 없으니 0으로 채워준다
        stack=[0]+tri+[0]
        tri=[] #해당 줄에서 사용할 숫자를 저장할 리스트
        #pop()을 하면 최근에 사용할 숫자를 저장할 리스트

        num=stack.pop() #자신의 오르쪽 위 숫자 가져오기

        while stack:
            num2=stack.pop() #왼쪽 위 숫자 가져오기
            tri.append(num+num2)

            num = num2 #자신의 오른쪽 숫자를 왼쪽 숫자로 바꿔줌
        print(*tri)

            