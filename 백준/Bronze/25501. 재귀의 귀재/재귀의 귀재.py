def recursion(s, l, r):
    global cnt
    if l >= r: return 1, cnt
    elif s[l] != s[r]: return 0, cnt
    else:
        cnt+=1
        return recursion(s, l+1, r-1)

def isPalindrome(s):
    global cnt
    cnt+=1
    return recursion(s, 0, len(s)-1)

TC=int(input())
for tc in range(TC):
    cnt=0
    a=isPalindrome(input())
    print(*a)