from collections import *

def solution(participant, completion):
    p_dit=Counter(participant)
    c_dit=Counter(completion)
    
    for person in participant:
        if c_dit[person]!=p_dit[person]:
            answer=person
            
    return answer


#배열 participant , completion 완주 못한 선수 return 
