class Solution {
    public int smallestNumber(int n, int t) {
        int curr = n;
        
        while (true) {
            int temp = curr;
            int product = 1;
          
            while (temp > 0) {
                product *= temp % 10;
                temp /= 10;
            }
            
            
            if (product % t == 0) {
                return curr; 
            }
            
            curr++; 
        }
    }
}
