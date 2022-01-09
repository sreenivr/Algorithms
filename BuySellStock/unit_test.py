import unittest
from solution import *

class BuySellTest(unittest.TestCase):
    def test_simple(self):
        prices = [7,1,5,3,6,4]
        profit = find_max_profit(prices)
        self.assertEqual(profit, 5)

    def test_no_profit(self):
        prices = [7,6,4,3,1]
        profit = find_max_profit(prices)
        self.assertEqual(profit, 0)

if __name__ == '__main__':
    unittest.main()                