#https://codeforces.com/problemset/problem/282/A
n = int(input())

cont = 0
for _ in range(n):
    statement = input()
    if "++" in statement:
        cont += 1
    else:
        cont -= 1
print(cont)