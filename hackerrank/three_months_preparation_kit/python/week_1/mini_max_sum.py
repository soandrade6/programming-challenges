def miniMaxSum(arr):
    l = len(arr)
    arr_sorted = sorted(arr)
    max_sum = sum(arr_sorted[1:l])
    min_sum = sum(arr_sorted[0:l-1])
    
    print(min_sum, max_sum)
    

