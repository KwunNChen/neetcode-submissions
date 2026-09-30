class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int top = 0;
            int topKey = 0;
            for (int key : seen.keySet()) {
                int frequency = seen.get(key);
                if (frequency > top) {
                    top = frequency;
                    topKey = key;
                }
            }
            result[i] = topKey;
            seen.remove(topKey);
        }
        return result;
    }
}