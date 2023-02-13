import sys
n=int(sys.stdin.readline())

counts=[0]*10001 #수의 개수를 세리는 counts 변수를 *로 할당

for i in range(n):
	counts[int(sys.stdin.readline())]+=1    #counts에 +1씩함

for i in range(10001):      #counts를 다 돌면서 counting된 횟수가 있으면(여기서 차례로 for문을 돌면서 정렬이 되는것)
	if counts[i]!=0:        
		for j in range(counts[i]): #그 횟수만큼
			print(i)   