# https://codeforces.com/problemset/problem/791/A

limak_weigth, bob_weigth = map(int, input().split())

band = True
years = 0

while band:
    years += 1
    limak_weigth *= 3
    bob_weigth *= 2
    if limak_weigth > bob_weigth:
        band = False
print(years)    