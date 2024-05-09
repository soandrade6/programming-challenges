def diagonalDifference(arr):
    n = len(arr)
    diagonal_1 = sum([arr[i][i] for i in range(n)])
    diagonal_2 = sum([arr[i][n-i-1] for i in range(n)])
    
    return abs(diagonal_1 - diagonal_2)

