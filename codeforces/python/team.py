# https://codeforces.com/problemset/problem/231/A
n = int(input())
count = sum(1 for _ in range(n) if input().split().count("1") >= 2)
print(count)
    

    

