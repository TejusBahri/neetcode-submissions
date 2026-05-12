class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[size + 1];
        for (int i = 0; i <= size; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            buckets[frequency].add(entry.getKey());
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && ans.size() < k; i--) {
            if (!buckets[i].isEmpty()) {
                for (int num : buckets[i]) {
                    if (ans.size() < k) {
                        ans.add(num);
                    } else {
                        break;
                    }
                }
            }
        }
        int[] ansArr = new int[ans.size()];
        for(int i=0; i<ansArr.length; i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}
