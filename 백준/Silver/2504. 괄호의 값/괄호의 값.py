# ()의 값 2
# []의 괄호값은 3
#()()[] =>2+2+3

words=list(input())
stack=[]
result=0
tmp=1


for i in range(len(words)):
    if words[i]=='(':
        stack.append('(')
        tmp*=2

    elif words[i]=='[':
        stack.append('[')
        tmp*=3

    elif words[i]==')':
        if not stack or stack[-1]=='[':
            result=0
            break
        if words[i-1]=='(':
            result+=tmp #닫는 괄호가 정확하게 나오면 결과값에 저장하는 것
        stack.pop()
        tmp//=2 ###()의 값인 2는 계속 가져야되기 때문에 //2
    else: 
        if len(stack)==0 or stack[-1]=='(':
            result=0
            break
        if words[i-1]=='[':
            result+=tmp
        stack.pop()
        tmp//=3

if stack:
    print(0)
else:
    print(result)
