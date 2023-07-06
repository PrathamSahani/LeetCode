class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        merged_list = nums1 + nums2
        merged_list.sort()
        mid = len(merged_list) // 2
        if len(merged_list) % 2 == 0:
            median = (merged_list[mid] + merged_list[mid - 1]) / 2.0
        else:
            median = float(merged_list[mid])
        return median
        