class Solution {
    public boolean isAnagram(String s, String t) {
        int []frequency = new int[26];
        if (s.length() != t.length())
            return false;
        
        int i,j;
        for(i=0,j=0;i<s.length()&&j<t.length();i++,j++){
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }

        for(i=0;i<26;i++){
            if (frequency[i] > 0 || frequency[i] < 0)
                return false;
        }
        return true;
    }
}
