class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int i :nums ){
            set.add(i);
            if(set.size()>3)
                set.remove(set.first());
        }
        if(set.size() < 3)
            return set.last();

        return set.first();
    }
}