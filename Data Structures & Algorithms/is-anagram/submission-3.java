class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sSeen = new HashMap<>();
        HashMap<Character, Integer> tSeen = new HashMap<>();

        if(s==null || t==null){
            return false;
        }
        for (int i=0; i<s.length();i++){
            char curr = s.charAt(i);
            if(sSeen.containsKey(curr)){
                sSeen.put(curr,sSeen.get(curr)+1);
            }else{
                sSeen.put(curr,1);
            }
        }
        for (int i=0; i<t.length();i++){
            char curr = t.charAt(i);
            if(tSeen.containsKey(curr)){
                tSeen.put(curr,tSeen.get(curr)+1);
            }else{
                tSeen.put(curr,1);
            }
        }
        //Check if they're the same
        if(sSeen.size()==tSeen.size()){
            for(int i=0;i<s.length();i++){
                char curr = s.charAt(i);
                if(!tSeen.containsKey(curr)){
                    return false;
                }
                if(!sSeen.get(curr).equals(tSeen.get(curr))){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
    
}
