
# Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
def find_max_profit(prices):
    l, r = 0, 1  # l = left (buy) pointer, r = right (sell) pointer
    max_profit = 0

    while r < len(prices):
        if prices[r] < prices[l]:
            l = r
        else:
            profit = prices[r] - prices[l]
            max_profit = max (profit, max_profit)
        
        r += 1

    return max_profit


if __name__ == '__main__':
    prices = [7,1,5,3,6,4]
    print (find_max_profit(prices))
