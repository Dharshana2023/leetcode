class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] word=s.split(" ");
        if(pattern.length()!=word.length){
            return false;
        }
        Map<Object,Integer> index=new HashMap<>();
        for(int i=0;i<pattern.length();++i){
            if(!Objects.equals(index.put(pattern.charAt(i),i),index.put(word[i],i))){
                return false;
            }
        }
            return true;
        }
    }
