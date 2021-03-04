#what is so coll about this one is that it actually jumps around the the list to every value until it starts over
#list is prime and so is list -2
#hash tables are generally O(1)for search, insert, and delete
#Hash tables are pretty effective until they get about 70% full
def doubleHash(key, list):
    index = key
    increment = personalIncrement(key, list)
    while list[index%len(list)] != None :
        index = index%len(list) + increment
    list[index%len(list)] = key

def personalIncrement(key, list):
    return 1 + key % (len(list) - 2)


list = []
for i in range(13):
    list.append(None)

keys = [5,53,35,56,92,15,62,73,55,142,11,93]
for i in keys:
    doubleHash(i, list)
print(list)
