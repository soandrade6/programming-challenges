# https://codeforces.com/problemset/problem/112/A

string_1, string_2 = input().lower(), input().lower()
print(-1 if string_1 < string_2 else 1 if string_1 > string_2 else 0)
