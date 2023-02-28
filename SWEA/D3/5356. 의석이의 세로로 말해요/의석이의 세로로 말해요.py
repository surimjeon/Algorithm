T=int(input())

for tc in range(1,T+1):
    word_len=[]
    words=[]
    result=''
    for i in range(5):
        word=list(input())
        word_len.append(len(word)) #최대길이에서 길이를 줄이면서 그 개수만큼 가지고 있는 문자들을 뽑기 위해
        words.append(word)
    
    for i in range(max(word_len)):
        for j in range(5):
            if i<word_len[j]:
                result+=words[j][i]
    print(f'#{tc} {result}')