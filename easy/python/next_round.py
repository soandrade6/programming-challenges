#https://codeforces.com/problemset/problem/158/A
n, k = map(int, input().split())
place = list(map(int, input().split()))

count = sum([1 for i in range(n) if place[i] > 0 and place[i] >= place[k-1]])
print(count)
        




