def solution(babbling):
    answer = 0
    possible=['aya','ye','woo','ma']
    lst=[]
    
    for ba in babbling:
        for po in possible:
            ba=ba.replace(po,'*')
        lst.append(ba)
                
    for l in lst:
        if len(set(l)) == 1 and '*' in l:
            answer+=1
    return answer