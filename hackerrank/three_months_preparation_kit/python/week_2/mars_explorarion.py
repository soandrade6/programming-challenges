def marsExploration(s):
    cont = 0
    pattern = ['S', 'O', 'S']
    for i in range(len(s)):
        mod = i % 3
        char = s[i]
        if pattern[mod] != char:
            cont += 1 
    return cont