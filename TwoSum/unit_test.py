import unittest
from two_sum import *

class TwoSumTest(unittest.TestCase):
    def test_basic(self):
        nums = [2, 10, 7, 11, 15]
        target = 26
        result = twoSum(nums, target)
        self.assertIsNotNone(result)
        self.assertEqual(result[0], 3)
        self.assertEqual(result[1], 4)

    def test_invalid(self):
        nums = [2, 10, 7, 11, 15]
        target = 50
        result = twoSum(nums, target)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()        