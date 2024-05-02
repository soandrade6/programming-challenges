def split(category, words):
    words_list = []
    current_word = ""
    
    for letter in words:
        if letter.isupper():
            if current_word:
                words_list.append(current_word.lower())
            current_word = letter
        else:        
            current_word += letter   
            
    if current_word and category == "M":
        words_list.append(current_word[:-2].lower())   
    else:
       words_list.append(current_word.lower())         
    
            
    return " ".join(words_list)
           

def combine(category, words):
    words = words.split()
    if category != "C":
        combination = words[0]
        for i in words[1:]:
            combination += i.capitalize()
        if category == "M":
            return combination + "()"
        return combination    
    else:
        combination = ""
        for i in words:
            combination += i.capitalize()
        return combination
            

def process_input(line):
    operation, category, words = line.split(";")
    if operation == "S":
        return split(category, words)
    else:
        return combine(category, words)
    
            
while True:
    try:
        line = input().rstrip()
        result = process_input(line)
        print(result)
    except EOFError:
        break
 
         
    
                
            