class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        count=1
        if len(nums)==1:
            return nums[0]
        for i in range(1, len(nums)):
            if nums[i]==nums[i-1]:
                count=count+1
            else:
                count =1
            if count>len(nums)/2:
                return nums[i]
        return -1