class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                result += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(set.size() > 0)
            result++;

        return result;
    }
}