class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int arr[]=new int [n];
        if (k>=n){
            k=k%n;
        }
         if (n==1 || k==0) return;
              for(int i=0;i<n-k;i++){
            arr[i+k]=nums[i]; 
        }
        int n1=0;
        for(int j=n-k;j<=n-1;j++){
            arr[n1]=nums[j];
            n1++;
        }
      
        for (int m =0;m<n;m++){
            nums[m]=arr[m];
        }
    }
}