n=int(input())

#조건 2개
#1)오름차순으로 push됨 ->출력결과 +,- 로 출력
####for문으로 숫자를 늘려가면 이전값이 저장되지 않음=>변수로 할당해줘야함.
#그리고, pop은 어차피 -1값이 빠져나옴
#2)이걸 만족못하면 False

ans=[] #정답 출력하기 위한 변수
stack=[]
count=1 #정렬할 숫자를 변수로 할당해줌
decide=True #조건들 만족못할시 변경할 값

for k in range(n):
    num=int(input()) 
    while count<=num: #count가 우리가 넣을 값, num:주어진값
        stack.append(count)
        count+=1
        ans.append('+')
    if stack[-1]==num: #우리는 스택의 마지막값이 우리가 뺄려는 값이랑 일치하는지를 볼꺼야
        stack.pop()
        ans.append('-')
        continue #이 조건을 만족하면 num를 다시받자! (계속해!)
    else:
        decide=False
        break

if decide==False:
    print('NO')
else:
    for i in ans:
        print(i)
        
