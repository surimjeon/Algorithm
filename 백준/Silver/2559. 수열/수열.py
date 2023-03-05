n,k=map(int,input().split()) #개수, k:연속적인 날짜 수

lst=list(map(int,input().split()))
hap=sum(lst[:k])
hap_lst=[hap]

for i in range(n-k):
    hap=hap-lst[i]+lst[i+k]
    hap_lst.append(hap)

print(max(hap_lst))