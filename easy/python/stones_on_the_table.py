# https://codeforces.com/problemset/problem/266/A

n_stones = int(input())
stones = input()

cont = sum([1 for i in range(n_stones - 1) if stones[i] == stones [i + 1]])       
print(cont)