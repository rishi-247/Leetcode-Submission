class Solution {
    public String longestCommonPrefix(String[] strs) {
     int smallest=strs[0].length();
     String prefix="";
         for(int j=0;j<strs.length;j++){
            if(smallest>strs[j].length()){
                smallest=strs[j].length();
            }
        }
        for(int i=0;i<smallest;i++){
            for(int k=0;k<strs.length-1;k++){
                if(strs[k].charAt(i)==strs[k+1].charAt(i)){
                    continue;
                }
                else{
                    return prefix;
                }
            }
                 prefix =prefix + strs[0].charAt(i);
        }
        return prefix;

    }
}