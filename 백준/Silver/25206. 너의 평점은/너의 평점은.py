
dit={'A+':4.5, 'A0':4.0, 
     'B+':3.5, 'B0':3.0, 
     'C+':2.5, 'C0':2.0, 
     'D+':1.5,'D0':1.0, 'F':0.0}
score_lst=[] #학점들 
total=[] #학점*과목평점

for _ in range(20):
    test=list(input().split())
    score=float(test[1])
    grade_score=test[2]
    if grade_score=='P':
        continue
    else:
        score_lst.append(score)
        grade=dit[grade_score]
        total.append(score*grade)

ans=sum(total)/sum(score_lst)

if sum(score_lst)==0:
    ans=0

print(ans)



