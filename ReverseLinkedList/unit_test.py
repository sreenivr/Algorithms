import unittest
from reverse import *

class LinkedListTest(unittest.TestCase):
    def test_reverse(self):
        myList = LinkedList()
        myList.add(1)
        myList.add(2)
        myList.add(3)
        self.assertEqual(myList.head.value, 1)
        self.assertEqual(myList.tail.value, 3)
        myList.reverse()
        self.assertEqual(myList.head.value, 3)
        self.assertEqual(myList.tail.value, 1)

    def test_single_element(self):
        myList = LinkedList()
        myList.add("Hello")
        self.assertEqual(myList.head.value, "Hello")
        self.assertEqual(myList.tail.value, "Hello")

if __name__ == '__main__':
    unittest.main()                