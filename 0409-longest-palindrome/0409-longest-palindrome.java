class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.computeIfPresent(s.charAt(i), (k,v) -> v + 1);
            }
            else hashMap.put(s.charAt(i), 1);
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