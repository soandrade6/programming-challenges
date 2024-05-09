import math

def gradingStudents(grades):
    rounded_grades = []
    
    for grade in grades:
        if grade < 38 or (math.ceil(grade/5)*5 - grade) >= 3:
            rounded_grades.append(grade)
        else:
            rounded_grades.append(math.ceil(grade/5)*5)   
    
    return rounded_grades        
    
    
