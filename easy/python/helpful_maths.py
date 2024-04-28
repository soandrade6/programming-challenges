# https://codeforces.com/problemset/problem/339/A

summ = list(map(int, input().split("+")))
summ.sort()

print("+".join([str(num) for num in summ]))
