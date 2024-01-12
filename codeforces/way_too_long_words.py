n = int(input())
for _ in range(n):
    word = input()
    if len(word) <= 10:
        print(word)
    else:
        #print(word[0] + str(len(word[1:-1])) + word[-1])
        print(word[0] + str(len(word) - 2) + word[-1])



