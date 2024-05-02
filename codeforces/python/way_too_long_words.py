#https://codeforces.com/problemset/problem/71/A
n = int(input())

for _ in range(n):
    word = input()
    print(word if len(word) <= 10 else f'{word[0]}{len(word)-2}{word[-1]}')




