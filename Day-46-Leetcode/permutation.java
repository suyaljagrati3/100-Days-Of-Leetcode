class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int k = s1.length();
        int left = 0;
        //Storing the frequency of s1
        for(int i=0; i<s1.length(); i++) {
             freq1[s1.charAt(i) - 'a']++;
        }

        //Starting the sliding window on s2
        for(int right = 0; right<s2.length(); right++) {
            freq2[s2.charAt(right) - 'a']++;
            if(right - left +1 == k) {
                if (Arrays.equals(freq1, freq2)) {
    return true;
}
            
            freq2[s2.charAt(left) - 'a']--;
left++;
        }
        }
        return false;
    }
}