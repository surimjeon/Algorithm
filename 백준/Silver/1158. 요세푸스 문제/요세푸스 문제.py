n, k = map(int, input().split())  # 1부터 n까지, k번쨰사람을 제거
arr = [i for i in range(1, n + 1)]
stack = []  # 출력할 대상을 넣을 배열
idx = 0

for i in range(n):
    idx += k - 1  # 큐에 있는 rear를 k번으로 이동
    if idx >= len(arr):  # rear이 arr범위를 넘어간다면
        idx = idx % len(arr)  # 그 길이만큼 나눈 나머지가 rear이 됨!!(중요)
    stack.append(str(arr.pop(idx)))  # 답을 넣기

print('<', ', '.join(stack), '>', sep='')  # 구분자로 띄어쓰기 없애기
