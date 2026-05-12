class Solution {
    public int[] productExceptSelf(int[] arr) {
        int size = arr.length;
        List<Integer> zeroIdx = new ArrayList<>();
        for(int i=0; i<size; i++){
            if(arr[i]==0) zeroIdx.add(i);
        }

        int[] ans = new int[size];
        int totalProduct = 1;
        if(zeroIdx.size()==0){
            for(int i=0; i<size; i++){
                totalProduct = totalProduct*arr[i];
            }
            for(int i=0; i<size; i++){
                ans[i] = totalProduct/arr[i];
            }
        }
        else if(zeroIdx.size()==1){
            for(int i=0; i<size; i++){
                if(zeroIdx.get(0)==i){
                    continue;
                }
                else{
                    ans[i] = 0;
                    totalProduct=totalProduct*arr[i];
                }
            }
            ans[zeroIdx.get(0)] = totalProduct;
        }
        else{
            for(int i=0; i<size; i++){
                ans[i] = 0;
            }
        }
        return ans;
    }
}  
