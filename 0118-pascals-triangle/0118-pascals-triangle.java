class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resp=new ArrayList<>();
        resp.add(List.of(1));
        for(int i=1;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(resp.get(i-1).get(j-1)+resp.get(i-1).get(j));
            }
            temp.add(1);
            resp.add(temp);
        }
        return resp;
    }
}