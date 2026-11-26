class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();

        for(int num:nums1){
            ans.add(num);
        }
        for(int n:nums2){ 
        if(ans.contains(n)){
            result.add(n);
        }
        }
        int[] arr=new int[result.size()];
        int i = 0;

        for(int n : result) {
            arr[i++] = n;
        }

        return arr;
}
}