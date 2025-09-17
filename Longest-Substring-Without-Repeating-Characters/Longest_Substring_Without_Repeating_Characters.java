class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) { //i = r
            char c = s.charAt(i);
    

            while (set.contains(c)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }
}
/**
substring. -> two pointers
*/