# 개수: 1, 2, 3, 4, 
# 1/ 2,3 / 4,5,6 / 7,8,9,10 / 11 12 13 14 15 / 16

import sys

n=int(sys.stdin.readline())

i=0
end=0 #라인의 마지막 인덱스 (1,3,6,10,15->마지막 인덱스는 누적해서 더해지는 값)
while n>end:
    i+=1
    end+=i
#i라인에 있다는 것 1부터 
#지그재그 위치 찾기
#홀수는 분자-1, 분모+1
#짝수는 분자+1, 분모-1
if i%2==0: #분자+분모-1=i
    b=1+(end-n)
    a=i-(end-n)
    print(f'{a}/{b}')
else:
    a=1+(end-n)
    b=i-(end-n)
    print(f'{a}/{b}')