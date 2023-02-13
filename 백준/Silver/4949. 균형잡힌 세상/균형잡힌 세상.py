
while True:
    word=input()
    stack=[]
    temp=True
    if word=='.':
        break
    for i in word:
        if i =='(' or i=='[':
            stack.append(i)
        elif i==']':
            if len(stack)==0 or stack.pop()!='[':
                temp=False
                break
        elif i==')':
            if len(stack)==0 or stack.pop()!='(':
                temp=False
                break

    if temp==True and len(stack)==0: #temp가 true이고, 길이가 0이면 out
        print('yes')
    else:
        print('no')


