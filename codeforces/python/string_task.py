#https://codeforces.com/problemset/problem/118/A

given_string = input().lower()
vowels = ["a", "o", "y", "e", "u", "i"]

result = ""
for i in given_string:
    if i not in vowels:
        result += "." + i
        
print(result)
