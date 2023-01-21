class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int sequenceCounter = 0;
        for(int i = 0; i < t.length(); i++)
        {
            if(sequenceCounter < s.length() && t.charAt(i) == s.charAt(sequenceCounter)) sequenceCounter++;
        }
        return sequenceCounter == s.length();
    }
}