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
            print ("Found the pair. Index = ", htbl[t], i)
            return [htbl[t], i]
        else:
            htbl[num] = i
            
    print ("Something is wrong. Couldn't find the pair")
    #print(htbl)
        

nums = [2, 10, 7, 11, 15]
target = 26

twoSum(nums, target)