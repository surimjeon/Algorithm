TC=int(input())

def fun(a):
    stack = []
    for i in a:
        if i=='(':
            stack.append('(')
        else:
            if len(stack)!=0:
                stack.pop()
            else:
                return False

    if len(stack)>0:
        return False
    else:
        return True

for tc in range(TC):
    a=list(input())
    if fun(a)==False:
        print('NO')
    else:
        print('YES')