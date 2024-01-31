#https://codeforces.com/problemset/problem/158/A
n, k = map(int, input().split())

places = list(map(int, input().split()))

cont = 0
for i in range(n):
    if places[i] > 0 and places[i] >= places[k-1]:
        cont += 1

print(cont)


