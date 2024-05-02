# https://codeforces.com/problemset/problem/263/A


def min_moves_to_beautiful(matrix):
    moves = 0
    for i in range(5):
        for j in range(5):
            if matrix[i][j] == 1:
                moves += abs(i - 2) + abs(j - 2)  
    return moves


matrix = []
for _ in range(5):
    row = list(map(int, input().split()))
    matrix.append(row)

print(min_moves_to_beautiful(matrix))

            

