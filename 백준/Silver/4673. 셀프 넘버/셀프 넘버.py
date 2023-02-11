num=set(range(1,10000)) #전체 숫자 
seosung=set() #중복은 필요없으니 set를 활용, 생성자가 있는 곳 저장
for i in range(1,10000):  
    for j in str(i):
        i+=int(j)
    seosung.add(i) #39(넘버)

self_num=sorted(num-seosung)

for i in self_num:
    print(i)