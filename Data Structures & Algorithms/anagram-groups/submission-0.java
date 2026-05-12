class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int size = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<size; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tempStr = new String(temp);
            if(map.containsKey(tempStr)){
                List<String> tempList = map.get(tempStr);
                tempList.add(strs[i]);
                map.put(tempStr, tempList);
            }
            else{
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                map.put(tempStr, tempList);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> value : map.values()){
            ans.add(value);
        }
        return ans;
    }
}
