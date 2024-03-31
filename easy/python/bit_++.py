#https://codeforces.com/problemset/problem/282/A
n = int(input())
statements = '\n'.join([input() for _ in range(n)])
cont = statements.count("++") - statements.count("--")
print(cont)

