n,w,l =map(int,input().split()) #트럭의 수, 다리 길이=시간, 다리의 최대하중
truck=list(map(int,input().split()))

bridge=[0]*w
time=0 #결과 저장값

while bridge: #트럭이 모두 없으면, append하는 내용없이 pop만 될거니까, 마지막 트럭이 모두 지나가면 끝난다. 
    bridge.pop(0) 
    time+=1 #1초 지나서 처음 트럭이 들어옴
    if truck:
        if sum(bridge)+truck[0]<=l: #전체하중이 최대하중보다 작으면
            a=truck.pop(0) #트럭무게를 빼서
            bridge.append(a) #다리위에 올린다.
        else:
            bridge.append(0) #아니면 다리에 0을 올리고, 이동시킨다.

print(time)