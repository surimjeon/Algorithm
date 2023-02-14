import sys

n_list = list(sys.stdin.readline())
stack = []
cnt = 0  # 조각개수
for i in range(len(n_list)):
    if len(stack)==0:
        stack.append(n_list[i])
    else:
        if n_list[i]=="(":
            stack.append(n_list[i])
        else:  # ) 의 경우
            if n_list[i-1]=="(": #괄호가 바로 닫히면
                stack.pop()     #괄호 pop시키고
                cnt+=len(stack) #막대 개수 세리기 ! 막대는 ( 하는 순간 생기기 때문에 (가 append되면 숫자 생김)
            else:               # 괄호가 바로 닫히지 않으면 )) 의 경우이면
                cnt+=1          #막대가 끝나는 점이면 막대 개수+1(막대가 한개 생기는 것)
                stack.pop()

print(cnt)