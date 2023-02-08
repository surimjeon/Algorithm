n,k=map(int, input().split())

number=list(map(int,input().split()))

number.sort(reverse=True)

print(number[k-1])