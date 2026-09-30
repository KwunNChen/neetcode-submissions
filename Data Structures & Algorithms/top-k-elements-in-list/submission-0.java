class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> seen = new HashMap<>();

        // Count occurrences
        for (int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        // Pick the current most frequent key, k times
        for (int i = 0; i < k; i++) {
            int top = 0;       // reset each round
            int topKey = 0;
            for (int key : seen.keySet()) {
                int frequency = seen.get(key);
                if (frequency > top) {
                    top = frequency;
                    topKey = key;
                }
            }
            result[i] = topKey;    // arrays assign by index
            seen.remove(topKey);   // remove only after the inner loop finishes
        }
        return result;
    }
}