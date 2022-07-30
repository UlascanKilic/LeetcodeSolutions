class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> expected = new ArrayList<>();
        for(int i :nums)
            set.add(i);

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)) expected.add(i);
        }
        return expected;
    }
}