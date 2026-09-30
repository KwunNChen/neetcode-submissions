class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>(nums.length * 2);

        for (int i=0; i<nums.length;i++){
            int val = nums[i];
            int need = target - val;
            if(seen.containsKey(need)){
                return new int[] {seen.get(need),i};
            }else{
                seen.put(val,i);
            }
        }
        return null;
    }
}
