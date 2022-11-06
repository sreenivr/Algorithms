#
# Linked list add, disaply, reverse implementation
#

class LinkedList():
    # Inner class
    class Node():
        def __init__(self, value) -> None:
            self.value = value
            self.next = None

    def __init__(self) -> None:
        self.head = None
        self.tail = None

    def add(self, value):
        n = self.Node(value)
        if(self.head is None):
            self.head = n
        if(self.tail is not None):
            self.tail.next = n
        self.tail = n

    def display(self):
        current = self.head
        while(current is not None):
            print(current.value)
            current = current.next

    def reverse(self):
        if(self.head is None):
            return

        current = self.head
        prev = None
        while(current is not None):
            next = current.next
            current.next = prev
            prev = current
            current = next  

        # Swap head and tail
        t = self.head
        self.head = self.tail
        self.tail = t


if __name__ == '__main__':
    myList = LinkedList()
    myList.add(1)
    myList.add(2)
    myList.add(3)
    myList.display()
    myList.reverse()
    myList.display()