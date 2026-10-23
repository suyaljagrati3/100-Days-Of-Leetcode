class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxWindow = 0;  //return length of longest substring
        int maxFrequency = 0;

        for(int right = 0; right<s.length(); right++) { //increase the frequency of the current array
            freq[s.charAt(right) - 'A']++;
            maxFrequency = Math.max(maxFrequency,  freq[s.charAt(right) - 'A']);
            int window_size = right - left +1;
            while(window_size - maxFrequency > k) {
                 freq[s.charAt(left) - 'A']--;
           left++;

          window_size = right - left + 1;
            }
            maxWindow = Math.max(maxWindow, window_size);
}
return maxWindow; 
        }

    }
