n=int(input())
dit={}

for i in range(n):
    word=(input().split('.'))[1]
    if word in dit:
        dit[word]+=1 #확장자가 lst에 있으면 그 확장자가 있는 인덱스에 +1
    else:
        dit[word]=1

sorted_dit=sorted(dit.items())
for k,v in sorted_dit:
    print(k,v)