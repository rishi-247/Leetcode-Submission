class Solution {
    public int removeDuplicates(int[] nums) {
         int n=nums.length;
        if(n<1)return 0;
        int j=1;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }

        }
        return j;
    }
}