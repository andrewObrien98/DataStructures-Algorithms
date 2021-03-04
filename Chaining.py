"""The way this one works is that instead of dealing with collisions is simply just inserts and keys that land on the same index into a linked list"""


class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, item):
        node = Node(item)
        root = self.head
        while (self.head != None):
            self.head = self.head.next
        node = self.head
        self.head = root

class Node:
    def __init__(self, item):
        self.next = None
        self.item = item

def main():
    list = []
    for i in range(11):
        list.append(LinkedList())

    keys = [26, 42, 5, 44, 92, 59, 40, 36, 12]
    for i in keys:
        hash(i, list)


def hash(key, list):
    index = key % len(list)
    list[index].insert(key)



main()