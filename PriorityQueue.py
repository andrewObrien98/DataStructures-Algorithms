
"""
this one will prioritze it by keeping the max at the very top
list[0] = 0, this will always be, the max will always be at list[1], just makes it easier to find the parent
"""
class PriorityQueuesBinaryHeap:
    def __init__(self):
        self.list = [0]

    def insert(self, value):
        size = len(self.list)
        if(size < 2):
            self.list.append(value)
        else:
            kidSize = len(self.list)
            self.list.append(value)

            while kidSize > 1:
                parentSize = kidSize//2
                parent = self.list[parentSize]
                if value > parent:
                    self.list[kidSize] = parent
                    self.list[parentSize] = value
                    kidSize = parentSize
                else:
                    break

    def printList(self):
        print(self.list)

    def deleteMax(self):
        max = self.list[1]
        self.reOrganizeAfterMax(self.list[len(self.list)])
        return max

    def reOrganizeAfterMax(self, value):
        





