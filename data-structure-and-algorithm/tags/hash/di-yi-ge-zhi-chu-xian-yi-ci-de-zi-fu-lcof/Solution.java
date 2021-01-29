class Solution {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map = new LinkedHashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),false);
            }else {
                map.put(s.charAt(i),true);
            }
        }

        for(Map.Entry<Character,Boolean> entry : map.entrySet()){
            if(entry.getValue()){
                return entry.getKey();
            }
        }
        return ' ';
    }
}