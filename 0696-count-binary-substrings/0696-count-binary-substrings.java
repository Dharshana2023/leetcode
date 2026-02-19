class Solution {
    public int countBinarySubstrings(String s) {
        int str=1;
        int prev=0;
        int res=0;
       for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            str++;
        }else{
            prev=str;
            str=1;
        }
       
       if(str<=prev){
        res++;
       }
       }
       return res;
    }
}