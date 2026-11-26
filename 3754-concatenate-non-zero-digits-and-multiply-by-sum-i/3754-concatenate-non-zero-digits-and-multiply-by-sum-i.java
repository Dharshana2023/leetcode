class Solution {
    public long sumAndMultiply(int n) {
      String x="";
      int sum=0;
      while(n>0){
        int digit=n%10;
        if(digit!=0){
            x=digit+x;
            sum+=digit;
        }
        n=n/10;
      }
      if(x.equals("")) {
            return 0;
        }
      long num=Long.parseLong(x);
      return num*sum;
      }  
    }
