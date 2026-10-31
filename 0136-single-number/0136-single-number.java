class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        if(n<=1) return nums[0];
        int c=0;
        for (int i=0;i<n;i++) {
            c=0;
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i] && i< n-1){
                    int temp=nums[j];
                    nums[j]=nums[i+1];
                    nums[i+1]=temp;
                    c=1;
                    i++;
                    break;
                }
            }
            if (c==0){
                c=nums[i];
                break;
            }

        }
        return c;
    }
}