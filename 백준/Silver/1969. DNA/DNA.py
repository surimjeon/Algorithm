'''
각 문자열에서 다른 글자개수 = 해밍거리
->합이 가장작은 하나의 문자
'''

#입력값
#각 문자열을 리스트에 저장
#각 문자열을 돌면서 m개 길이만큼
#그 문자열을 키값으로 저장
#가장 max 값을 가지는 걸 출력하고, max값이 여러개면 ,,, 사전순ㅇ로 출력
#해밍거리 합은 다른 키들의 합 ,, 을 더하는 것

n,m=map(int,input().split())
lst=[list(input()) for _ in range(n)]
ans=''
cnt=0

for i in range(m):
    temp=[0]*4 #각각 a,c,g,t
    for j in lst:
        if j[i]=='A':
            temp[0]+=1
        elif j[i]=='C':
            temp[1]+=1
        elif j[i]=='G':
            temp[2]+=1
        elif j[i]=='T':
            temp[3]+=1
    mx_idx=temp.index(max(temp)) #가장 큰 값의 인덱스값을 숫자로 나타낸 걸 다시 문자로
    if mx_idx==0:
        ans+='A'
    elif mx_idx==1:
        ans+='C'
    elif mx_idx==2:
        ans+='G'
    elif mx_idx==3:
        ans+='T'
    cnt+=(n-max(temp))

print(ans)
print(cnt)



