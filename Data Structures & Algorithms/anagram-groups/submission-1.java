class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> result = new ArrayList<>();
    HashMap<String,List<String>> map = new HashMap<>();

    for (int i=0; i<strs.length;i++){
        char[] chars = strs[i].toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        if(!map.containsKey(sorted)){
            map.put(sorted,new ArrayList<>());
        }
        map.get(sorted).add(strs[i]);
    }
    //Populate result with map
    result.addAll(map.values());
    return result;
    }
}
