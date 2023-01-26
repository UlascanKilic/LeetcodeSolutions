class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }

        int result = 0;
        int odd = 0;

        for(int i : hashMap.values()){
            if(i % 2 == 0) result += i;
            else{
                result += i - 1;
                odd = 1;
            }
        }

        return result+odd;
    }
}