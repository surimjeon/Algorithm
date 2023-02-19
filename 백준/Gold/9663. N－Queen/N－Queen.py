import sys
sys.setrecursionlimit(10000)

#상하좌우 대각선 체크 함수
def check(i):
    for j in range(i):
        if row[i]==row[j] or abs(row[i]-row[j])==abs(i-j): #raw[i]==raw[j]: 세로값(열)이 같은 값이 들어가있는지 검사
            return False  #세로,대각선에 같은 값이 있으면 실패!  
    return True

def queen(i): #i=행
    global cnt
    if i==n:    #행이 끝까지 갔다면 cnt+1 (경우의 수 1증가)
        cnt+=1
        return 
    else:
        for j in range(n):
            row[i]=j #(i,j)에 퀸을 놓겠다(j는 열의 값이기 때문에 그 행에다가 열의 값을 저장)
            #raw[n]==n번째 행에서 현재 queen의 위치
            if check(i): #상하, 대각선 체크했더니 True라면
                queen(i+1)  #다음 탐색 

n=int(sys.stdin.readline())
row=[0]*n #행 기준으로 생각하기!!!
cnt=0
queen(0)
print(cnt)