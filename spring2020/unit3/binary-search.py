class Solution:
    def search(self, nums: List[int], target: int) -> int:
        return self.binary_search(nums, 0, len(nums) - 1, target)
    
    def binary_search(self, nums, lo, hi, target):
        if lo > hi:
            return -1
        mid = int(lo + (hi - lo) / 2)
        if nums[mid] < target:
            return self.binary_search(nums, mid + 1, hi, target)
        elif nums[mid] > target:
            return self.binary_search(nums, lo, mid - 1, target)
        else:
            return mid
    