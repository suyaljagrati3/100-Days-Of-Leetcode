# Day 01 - Next Greater Element I

**Problem:** https://leetcode.com/problems/next-greater-element-i/  
**Difficulty:** Easy  

**Approach:**  
- For each element in nums1, find its index in nums2  
- Search for the first greater element to its right  
- If not found, return -1  

**Sample Input:**  
nums1 = [4,1,2]  
nums2 = [1,3,4,2]

**Sample Output:**  
-1 3 -1

**Time Complexity:** O(m*n)  
**Space Complexity:** O(m)
