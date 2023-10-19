class Solution {
    public int[] searchRange(int nums[], int k) {
        int[] result = {-1, -1};
       
        for(int i=0; i<nums.length; i++){
            if(nums[i]==k){
                result[0]= i;
                break;
            }
            
        }
        if(result[0]==-1){
            return result;
        }
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == k) {
                result[1] = i;
                break;
            }
        }
        return result;
        
    }
}