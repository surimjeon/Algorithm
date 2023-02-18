n=int(input())

def stars(n):
    if n==1:
        return ['*']
    lst=[]
    star=stars(n//3)
    
    for i in star: #star은 ['*']
        lst.append(i*3)
    for i in star:
        lst.append(i+' '*(n//3)+i)
    for i in star:
        lst.append(i*3)
    return lst


print('\n'.join(stars(n)))
