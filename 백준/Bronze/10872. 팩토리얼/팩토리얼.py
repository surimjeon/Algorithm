def fac(n):
    if n == 0:
        return 1
    return fac(n - 1) * n

n = int(input())
a = fac(n)
print(a)
