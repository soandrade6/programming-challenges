import string

# def pangrams(s):
#     s = s.lower()
#     letras_abecedario = set(string.ascii_lowercase)
#     letras_s = set(s)
    
#     if letras_abecedario.issubset(letras_s):
#         return "pangram"
#     return "not pangram"
        
def pangrams(s):
    if set(s.lower()) >= set(string.ascii_lowercase):
        return "pangram"
    return "not pangram"
        
#test        
print(pangrams("We promptly judged antique ivory buckles for the next prize"))
print(pangrams("We promptly judged antique ivory buckles for the prize"))