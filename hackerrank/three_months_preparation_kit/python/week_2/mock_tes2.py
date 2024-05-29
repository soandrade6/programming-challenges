#flipping the matrix 
def flippingMatrix(matrix):
    n = len(matrix) // 2  # Suponiendo que la matriz es 2n x 2n
    max_sum = 0
    for i in range(n):
        for j in range(n):
            # Encontrar el máximo valor de las cuatro posiciones simétricas
            max_value = max(
                matrix[i][j],
                matrix[i][2*n-j-1],
                matrix[2*n-i-1][j],
                matrix[2*n-i-1][2*n-j-1]
            )
            max_sum += max_value
    
    return max_sum
