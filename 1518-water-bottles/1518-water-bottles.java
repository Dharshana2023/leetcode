class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int max=numBottles;
        while(numBottles>=numExchange){
            int new1=numBottles/numExchange;
            int rem=numBottles%numExchange;
            max+=new1;
            numBottles=new1+rem;
        }
        return max;
}
}