#괄호를 보고 stack이 생각남
#이 문제는 괄호는 그대로 출력하고, 아닌 곳들은 반대로 출력해라
#반대로 출력되는 것=pop이 있음

words=input()

word=''
check=False
stack=[]

for w in words:
    if w=='<': #여는 괄호가 나오면 그대로 출력
        while stack: #혹시 이전에 stack에 값이 있었으면 다 거꾸로 pop하기
            word+=stack.pop()
        word+=w
        check=True
    elif w=='>': #닫는 괄호가 나오면 check해제
        word+=w
        check=False
    elif w==' ': #공백이면 새로운 글자를 만들어야 함(stack을 모두 빼줘)
        while stack:
            word+=stack.pop()
        word+=w
    elif check: #여는괄호 안 요소들이면 word문자열에 추가
        word+=w
    else:       #반대로 만들어야할 값은 일단 스택에 저장
        stack.append(w)

while stack:
    word+=stack.pop()

print(word)