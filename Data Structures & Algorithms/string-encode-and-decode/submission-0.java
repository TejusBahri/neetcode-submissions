class Solution {

    public String encode(List<String> strs) {
        StringBuffer str = new StringBuffer();
        for(int i=0; i<strs.size(); i++){
            str.append(strs.get(i));
            str.append("|");
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        char[] charArr = str.toCharArray();
        List<String> decodedList = new ArrayList<>();
        StringBuffer temp = new StringBuffer();
        for(int i=0; i<charArr.length; i++){
            if(charArr[i]!='|'){
                temp.append(charArr[i]);
            }
            else{
                decodedList.add(temp.toString());
                temp = new StringBuffer();
            }
        }
        return decodedList;
    }
}
