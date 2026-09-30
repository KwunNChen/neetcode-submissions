class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> seen = new HashMap<>();

        for (int i=0; i<nums.length;i++){
            if(seen.containsKey(nums[i])==false){
                seen.put(nums[i],true);
            }else{return true;}
        }
        return false;
    }
}