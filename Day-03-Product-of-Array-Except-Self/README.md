Day 03 - Product of Array Except Self

Problem:  https://leetcode.com/problems/product-of-array-except-self/

Difficulty: Medium

How I Solved It:

First, calculate the product of all numbers before each index (prefix).

Then, go from the end and multiply by the product of all numbers after each index (suffix).

This way, each position ends up with the product of all elements except itself.

Optimized version uses the answer array itself for prefix and then applies suffix to save space.
Time Complexity: O(n)
Space Complexity: O(1) (excluding the output array)