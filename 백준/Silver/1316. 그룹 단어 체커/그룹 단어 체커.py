number=int(input())
words=[]

for i in range(number):
    words=input() #ex) h a p p y 
    for n in range(len(words)): 
        if words[n] in words[n+1:]:
            if words[n]==words[n+1]:
                continue
            else : 
                number-=1
                break 
        else:
            continue

print(number)