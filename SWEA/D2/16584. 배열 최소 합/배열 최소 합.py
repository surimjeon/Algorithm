#백트래킹

def backtraking(i,n,visited, now_sum):
    global mn_sum
    if i==n:
        if now_sum < mn_sum:
            mn_sum = now_sum
    elif now_sum>mn_sum:
        return
    else:
        for j in range(n):
            if visited[j]==False:
                visited[j] = True
                backtraking(i+1,n,visited, now_sum+arr[i][j])
                visited[j]=False


T = int(input())

for tc in range(1, T + 1):
    n = int(input())  # 배열의 길이
    arr = [list(map(int, input().split())) for _ in range(n)]
    visited=[False]*n
    mn_sum=1000
    backtraking(0,n,visited,0)
    print(f'#{tc} {mn_sum}')