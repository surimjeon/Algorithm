import sys

word=sys.stdin.readline().rstrip() #대상 문자열
bomb=sys.stdin.readline().rstrip() #폭발문자열
stack=[]
repeat=len(bomb)

for i in range(len(word)):
    stack.append(word[i])
    if ''.join(stack[-len(bomb):])==bomb: #stack을 마지막부터 폭발문자와 같은 길이로 잘라서 폭발문자와 같은지 비교
        for j in range(repeat):
            stack.pop()

if len(stack)==0:
    print('FRULA')
else:
    result="".join(stack)
    print(result)
