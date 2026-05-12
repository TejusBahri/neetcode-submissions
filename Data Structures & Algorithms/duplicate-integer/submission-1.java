class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< size; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        boolean flag = false;
        for(int i=0; i<size; i++){
            if(map.get(nums[i])>1){
                flag=true;
                break;
            }
        }
        return flag;
    }
}