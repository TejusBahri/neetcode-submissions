class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int maxi = nums[0];
        for(int i=1; i<size; i++){
            maxi = Math.max(maxi, nums[i]);
            
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
            map.put(nums[i],i);
        }

        int[] finalArr = new int[2];
        for(int i=0; i<size; i++){
            if(map.containsKey(target-nums[i]) && i!=(map.get(target-nums[i]))){
                finalArr[0] = i;
                finalArr[1] = map.get(target-nums[i]);
                break;
            }
        }
        return finalArr;
    }
}
