class Solution {
    public boolean sumGame(String num) {
        int l=num.length()/2;
        int rightsum=0;int leftsum=0;
        for(int i=0;i<num.length();i++){
        char ch=num.charAt(i);
        int value;
        if(ch=='?'){
            value=9;
        }else{
            value=2*(ch-'0');
        }
        if(i<l){
            leftsum+=value;
        }else{
            rightsum+=value;
        }
        }
        return leftsum!=rightsum;
       } 
    }
