class Solution {
    public String reverseWords(String s) {
        String[] word=s.trim().split("\\s+");
        String op="";
        for(int i= word.length-1;i>=0;i--){
            op+=word[i];
            if(i!=0){
               op+=" "; 
            }
            
        }
        return op;
    }
}