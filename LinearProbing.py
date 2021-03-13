"""The way linear probing works is that it will try to insert the key into its index but if it is already taken then it just moves onto the next highest index until it loops around"""

def hash(key, list):
    index = key % len(list)
    while(list[index] != None):
        index += 1
        index = index % len(list)
    list[index] = key


setOfKeys = [[9, 12, 14, 3, 4, 21, 18],[9, 14, 4, 18, 12, 3, 21],[12, 14, 3, 9, 4, 18, 21],[12, 3, 14, 18, 4, 9, 21],[12, 9, 18, 3, 14, 21, 4]]
for keys in setOfKeys:
    list = []
    for i in range(9):
        list.append(None)
    for i in keys:
        hash(i, list)

    print(list, end = "")
    print(list == [9,18,None,12,3,14,4,21,None])