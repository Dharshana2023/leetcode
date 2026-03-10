class Solution {
    public boolean isHappy(int n) {
       HashSet <Integer> set=new HashSet<>();
       while(n!=1 && !set.contains(n)){
        set.add(n);
        n=Square(n);
       } 
       return n==1;
    }
    public int Square(int n){
        int s=0;
        while(n>0){
            int digit=n%10;
            s+=digit*digit;
            n=n/10;
        }
        return s;
    }
}