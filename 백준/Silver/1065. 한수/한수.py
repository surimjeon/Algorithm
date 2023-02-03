def is_han(n): #ex)99
    count=0
    for i in range(1, n+1):
        lst_n=[int(a) for a in str(i)] #9 . 9, 9  
        if i<100:
            count+=1
        elif lst_n[0]-lst_n[1]==lst_n[1]-lst_n[2]:
            count+=1
    return count

number=int(input())
print(is_han(number))