word_len=[]
word_lst=[]
word_r=[[]]


for i in range(5):
    word=list(input())
    word_len.append(len(word))
    word_lst.append(word)

result=''
for i in range(max(word_len)):
    for j in range(5):
        if i<word_len[j]: #한줄의 길이가 반복하는 단어의 길이보다 작을 때
            result+=word_lst[j][i]
print(result)