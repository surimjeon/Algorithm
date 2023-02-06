# #누적 
#초기화 변수 잘 지정하기!! 
TC=int(input())

for tc in range(TC):
    ox=[i for i in input()]
    count=0
    hap=0
    for i in range(len(ox)): 
        if ox[i]=='O':
            hap+=1
            count+=hap
        elif ox[i]=='X':
            hap=0
    print(count)
