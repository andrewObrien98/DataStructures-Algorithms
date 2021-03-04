"""The way linear probing works is that it will try to insert the key into its index but if it is already taken then it just moves onto the next highest index until it loops around"""

def hash(key, list):
    index = key % len(list)
    while(list[index] != None):
        index += 1
        index = index % len(list)
    list[index] = key


list = []
for i in range(11):
    list.append(None)

keys = [26, 42, 5, 44, 92, 59, 40, 36, 12]
for i in keys:
    hash(i, list)

print(list)