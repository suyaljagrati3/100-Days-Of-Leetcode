# Day 02 - Binary Search

**Problem:** Implement Binary Search to find an element in a sorted array.  
**Difficulty:** Easy  

**Approach:**  
- Keep track of left and right pointers.  
- Find mid index: `mid = left + (right-left)/2`  
- Compare `arr[mid]` with target:  
  - If equal → return index  
  - If smaller → search right half  
  - If larger → search left half  
- If not found, return -1  

**Sample Input:**  
arr = [1, 3, 5, 7, 9, 11], target = 7  

**Sample Output:**  
Element found at index: 3

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
