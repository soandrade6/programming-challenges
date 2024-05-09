def plusMinus(arr):
    n = len(arr)
    positive_count = sum(1 for i in arr if i > 0)
    negative_count = sum(1 for i in arr if i < 0)
    zero_count = n - positive_count - negative_count

    print(round(positive_count / n, 6))
    print(round(negative_count / n, 6))
    print(round(zero_count / n, 6))

    