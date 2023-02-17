#이 문제는 재귀로 풀기가 어렵다
#=>for문을 돌면서 1을 만나면 cnt1을 해주고 하는 게 필요한데,,

def count(mapp): #2차원 배열을 한줄씩 읽어서 각 줄에 최대 개수가 몇개인지 확인하는 함수
    mx=2
    for lst in mapp:
        cnt=0
        for j in lst:
            if j==1:
                cnt+=1
                if cnt>mx:
                    mx=cnt
            else:
                cnt=0
    return mx

T = int(input())

for tc in range(1, T + 1):
    n, m = map(int, input().split())
    mapp = [list(map(int, input().split())) for _ in range(n)]
    mapp_t=list(map(list,zip(*mapp))) #세로로도 탐색해서 가장 최대값들이 나오는지 검사
    #zip함수는 여러개의 순회가능한 객체를 인덱스별로 받아서 합쳐줌->
    # 010 010 010 => 첫번째 인덱스인 000 111 000끼리 만들어줌

    ans=count(mapp)
    ans_t=count(mapp_t)

    if ans_t>ans: #가로 최대값과 세로 최대값을 비교해서 더 높은 걸 답으로 도출
        ans=ans_t

    print(f'#{tc} {ans}')
