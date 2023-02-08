words=[]
n=int(input())
for i in range(n):
	word=input()
	words.append((word, len(word)))
	
a=sorted(words, key=lambda x : (x[1],x[0]))

arr=[]
results=[]
for i in range(len(a)):
    arr.append(a[i][0])

for i in arr:
    if i not in results:
        results.append(i)

for result in results:
    print(result)