n = int(input())

cont = 0
for _ in range(n):
    if sum(map(int, input().split())) >= 2:
        cont += 1

print(cont)


    

