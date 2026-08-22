class Solution {
    public boolean checkDivisibility(int n) {
        int orginalNum=n;
        int s=0;
        int p=1;
      while(n>0){
        int r=n%10;
        s+=r;
        p*=r;
        n=n/10;
       } 
       if (orginalNum%(p+s)==0){ 
       return true;}
       return false;
    
    }
}