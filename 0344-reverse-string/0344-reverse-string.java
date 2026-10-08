class Solution {
    public static void swap(int i,int n,char [] s,char temp){
        if (i>=n/2) return;
        temp=s[n-i-1];
        s[n-i-1]=s[i];
        s[i]=temp;
        swap(i+1,n,s,temp);
    }
    public void reverseString(char[] s) {
        swap(0, s.length,s,' ');
    }
}