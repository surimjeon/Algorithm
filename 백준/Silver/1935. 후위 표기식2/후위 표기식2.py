n=int(input())
sik=input()

stack=[]
alpha=[]
for a in range(n):
    num=int(input())
    alpha.append(num)


for w in sik:
    if 'A'<=w<='Z':
        stack.append(alpha[ord(w)-ord('A')])
    else:
        if w=='*':
            right=stack.pop()
            left=stack.pop()
            result=left*right
            stack.append(result)
        elif w=='+':
            right=stack.pop()
            left=stack.pop()
            result=left+right
            stack.append(result)
        elif w=='/':
            right=stack.pop()
            left=stack.pop()
            result=left/right
            stack.append(result)
        elif w=='-':
            right=stack.pop()
            left=stack.pop()
            result=left-right       
            stack.append(result)                 


print('{:.2f}'.format(*stack))

