class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        pile = []
        for n in nums:
            heapq.heappush(pile,n)
            if len(pile)>k:
                heapq.heappop(pile)
        return pile[0]