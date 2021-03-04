#this avoids primary clustering but not secondary clustering
#this is an example of quadratic probing which is h, h+1^2, h+2^2, h+3^2, h+4^2...
#I dont remember why but there is something magical about having the list length be a prime number

def hashQuadratic(number, list):
    index = number % 11
    if list[index] == None:
        list[index] = number
    elif list[findIndex(index + 1)] == None:
        list[findIndex(index + 1)] = number
    elif list[findIndex(index + 4)] == None:
        list[findIndex(index + 4)] = number
    elif list[findIndex(index + 9)] == None:
        list[findIndex(index + 9)] = number

def findIndex(number):
    if number > 10:
        return number - 11
    return number


list = []
for i in range(11):
    list.append(None)

keys = [26,42,5,44,92,59,40,36,12]
for i in keys:
    hashQuadratic(i, list)

print(list)
