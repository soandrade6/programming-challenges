#https://codeforces.com/problemset/problem/546/A

n, k, w = map(int, input().split())

costs = 0

for i in range(1, w+1):
    costs += i*n
    
print(max(0, costs-k))  


