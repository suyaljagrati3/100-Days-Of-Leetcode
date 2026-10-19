class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        int ans = 0;
        while(right < s.length()) {
          char  ch = s.charAt(right);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                count++;
            }
            if(right - left + 1 == k) {
                ans = Math.max(ans , count);
            char ch1 = s.charAt(left);
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'o' || ch1 == 'i' || ch1 == 'u') {
                count--;
            }
            left++;
        }
        right++;
        }
    return ans;    
    }
}