#점수의 최댓값
#모든 점수/M*100-> 각각의 점수가 됨
#새로운 평균을 구하기

n=int(input())
number=list(map(int, input().split()))
mx=max(number)
score=[]

for i in range(n):
    score.append(number[i]/mx*100)
    
mean=sum(score)/n

print(mean)
