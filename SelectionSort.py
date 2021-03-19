list = [5,6,4,7,3,7,3,5,7,1]

for i in range(len(list)):
    for j in range(len(list) - 1):
        if list[j] > list[j + 1]:
            tempNum = list[j]
            list[j] = list[j + 1]
            list[j + 1] = tempNum
print(list)