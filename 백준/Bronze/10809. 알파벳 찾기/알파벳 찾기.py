from string import ascii_lowercase
alpha_lst=list(ascii_lowercase)

word=list(input())
for a in alpha_lst:
    if a in word:
        print(word.index(a), end=' ')
    else:
        print(-1, end=' ')
