class Solution {
    public int maxProduct(int n) {
      char[] arr=String.valueOf(n).toCharArray();
      Arrays.sort(arr);
      int len=arr.length;
      int max=(arr[len-1 ]-'0')*(arr[len-2]-'0');
      return max;  
    }
}