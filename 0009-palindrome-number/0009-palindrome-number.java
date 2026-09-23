class Solution {
    public boolean isPalindrome(int x) {
    int orginal=x;
      int rev=0;  
      while(x>0){
        int digit=x%10;
        rev=rev*10+digit;
        x/=10;
      }
      if(orginal== rev){
        return true;
      }
      return false;
    }
}