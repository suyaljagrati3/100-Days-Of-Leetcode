class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int vowelcount = 0;
        int ans = 0;
        while(right < s.length()) {
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                count++;
            }
            if(right - left + 1 == k) {
                ans = Math.max(ans , count);
            
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                count--;
            }
            left++;
        }
        right++;
        }
    return ans;    
    }
}