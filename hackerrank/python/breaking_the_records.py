def breakingRecords(scores):
    min_score = max_score = scores[0]
    min_records_broken = max_records_broken = 0
    
    for i in scores[1:]:
        if i < min_score:
            min_score = i
            min_records_broken += 1
        elif i > max_score:
            max_score = i
            max_records_broken += 1
            
    return [max_records_broken, min_records_broken]
    
    