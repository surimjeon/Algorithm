n=int(input())
lst=[]

for _ in range(n):
	lst.append(int(input()))
	
for i in range(n-1,0,-1): #비교 패스의 수
	for j in range(i):
		if lst[j]>lst[j+1]:
			lst[j],lst[j+1]=lst[j+1], lst[j]

for result in lst:
    print(result)