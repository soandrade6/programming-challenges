def countingValleys(steps, path):
    current = 0
    count = 0
    for i in range(steps):
        temp = current
        if path[i] == 'U':
            current += 1
        else:
            current -= 1
        if temp < 0 and current == 0:
            count += 1
    return count
