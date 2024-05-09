def divisibleSumPairs(n, k, ar):
    num_pairs = 0
    for i in range(n):
        for j in range(i+1, n):  
            if (ar[i] + ar[j]) % k == 0:
                num_pairs += 1
                
    return num_pairs
     
          
                
                
