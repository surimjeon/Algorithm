T=int(input())
for t in range(1, T+1):
    C=int(input())
    coin=0
    rest=0
    dx=[25, 10, 5, 1]
    for i in dx:
        coin=C//i
        C=C-C//i*i
        print(coin, end=' ')
    print()