def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    
    # Create a hash table (Python dictionary) 
    htbl = {}
    for i, num in enumerate(nums):
        t = target - num
        if t in htbl.keys():
            return [htbl[t], i]
        else:
            htbl[num] = i
            
    return None
        
if __name__ == '__main__':
    nums = [2, 10, 7, 11, 15]
    target = 26
    result = twoSum(nums, target)
    if result is not None:
        print("Index of the items = {0}, {1}".format(result[0], result[1]))
    else:
        print("Couldn't find the solution")        